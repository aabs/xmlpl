using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;

namespace Utilities
{
    public class AppBus
    {
        private static AppBus _default;

        private AppBus()
        {
            Mappings = new Dictionary<Type, List<object>>();
        }

        protected Dictionary<Type, List<object>> Mappings { get; set; }

        public static AppBus Default
        {
            get
            {
                if (_default == null)
                {
                    _default = new AppBus();
                }
                return _default;
            }
        }

        public void Subscribe<TMessage>(Expression<Action<TMessage>> action)
        {
            Type messageType = action.Parameters.First().Type;
            if (!Mappings.ContainsKey(messageType))
            {
                Mappings[messageType] = new List<object>();
            }
            Mappings[messageType].Add(action.Compile());
        }

        private void InvokeOnList(object message, IEnumerable handlers)
        {
            foreach (object mapping in handlers)
            {
                var x = mapping as Delegate;
                if (x != null) x.DynamicInvoke(message);
            }
        }

        public void Announce(object message)
        {
            Type type = message.GetType();
            if (Mappings.ContainsKey(type))
            {
                InvokeOnList(message, Mappings[type]);
            }
            else
            {
                foreach (Type mapping in Mappings.Keys)
                {
                    if (mapping.IsInstanceOfType(message))
                    {
                        InvokeOnList(message, Mappings[mapping]);
                    }
                }
            }
        }

        public void Reset()
        {
            Mappings.Clear();
        }
    }
}