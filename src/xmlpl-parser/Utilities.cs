using System;
using System.Collections;
using System.Collections.Generic;
using Autofac;

namespace xmlpl_parser
{
    public class Utilities
    {
        static Utilities()
        {
            var cb = new ContainerBuilder();
            cb.RegisterInstance(new OperationProvider());
            Container = cb.Build();
            BuiltinFunctions = new[]
                                   {
                                       "identity", "+", "*", "XmlStartElement", "XmlIdent", "XmlAttrName", "XmlAttrVal",
                                       "XmlText", "XmlUniEnd", "XmlStartEndTag", "XmlEndBrace"
                                   };
        }

        protected static string[] BuiltinFunctions { get; set; }

        protected static IContainer Container { get; set; }

        private static Dictionary<string, Func<Stack, Stack>> Lut { get; set; }

        public static Func<Stack, Stack> ConstructFunction<T>(T i)
        {
            if (i is string)
            {
                return Lookup(i as string);
            }
            return stack =>
                       {
                           T tmpi = i;
                           stack.Push(tmpi);
                           return stack;
                       };
        }

        public static Func<Stack, Stack> Lookup(string name)
        {
            if (Lut.ContainsKey(name))
            {
                var op = Container.Resolve<IOperationProvider>();
                switch (name)
                {
                    case "identity":
                        return op.NoOp;
                    case "+":
                        return op.IntAdd;
                    case "*":
                        return op.IntMult;
                    case "XmlStartElement":
                        return op.XmlStartElement;
                    case "XmlIdent":
                        return op.XmlIdent;
                    case "XmlAttrName":
                        return op.XmlAttrName;
                    case "XmlAttrVal":
                        return op.XmlAttrVal;
                    case "XmlText":
                        return op.XmlText;
                    case "XmlUniEnd":
                        return op.XmlUniEnd;
                    case "XmlStartEndTag":
                        return op.XmlStartEndTag;
                    case "XmlEndBrace":
                        return op.XmlEndBrace;
                }
            }
            return Lut["identity"];
        }

        public static Func<Stack, Stack> ConstructNumericFunction(int i)
        {
            return ConstructFunction(i);
        }

        public static Func<Stack, Stack> ConstructString(string str)
        {
            return s =>
                       {
                           s.Push(str);
                           return s;
                       };
        }
    }
}