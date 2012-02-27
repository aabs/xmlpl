﻿using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using Autofac;

namespace xmlpl_parser
{
    [DebuggerDisplay("[{StackView}]")]
    public class StackMachine
    {
        static StackMachine()
        {
            var cb = new ContainerBuilder();
            cb.RegisterType<OperationProvider>().As<IOperationProvider>();
            Container = cb.Build();
        }

        public StackMachine()
        {
            InstructionPipeline = new Queue<Func<Stack, Stack>>();
            Stack = new Stack();
        }

        public Queue<Func<Stack, Stack>> InstructionPipeline { get; set; }
        public Stack Stack { get; set; }

        public string StackView
        {
            get { return string.Join(", ", Stack.ToArray().Select(x => x.GetType().Name).ToArray()); }
        }

        // TODO: reactive extensions?

        protected static IContainer Container { get; set; }

        public void Run()
        {
            while (InstructionPipeline.Count > 0)
            {
                Func<Stack, Stack> instruction = InstructionPipeline.Dequeue();
                Stack = instruction(Stack);
            }
        }

        public void CreatePusherFunction<T>(T i)
        {
            InstructionPipeline.Enqueue(stack =>
                                            {
                                                T tmpi = i;
                                                stack.Push(tmpi);
                                                return stack;
                                            });
        }

        public static Func<Stack, Stack> Lookup(string name)
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
                default:
                    return null;
            }
        }

        public void EnqueueBuiltinFunction(string functionName)
        {
            Func<Stack, Stack> op = Lookup(functionName);
            if (op == null)
                throw new ArgumentException(functionName + " was not recognised");

            InstructionPipeline.Enqueue(op);
        }
    }
}