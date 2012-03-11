using System;
using System.Collections;
using System.Xml;

namespace xmlpl_parser
{
    public class OperationProvider : IOperationProvider
    {
        public Stack NoOp(Stack s)
        {
            return s;
        }

        //[int, int] ==> [int]
        public Stack IntAdd(Stack s)
        {
            var x = (int) s.Pop();
            var y = (int) s.Pop();
            s.Push(x + y);
            return s;
        }

        //[int, int] ==> [int]
        public Stack IntMult(Stack s)
        {
            var x = (int) s.Pop();
            var y = (int) s.Pop();
            s.Push(x*y);
            return s;
        }

        //[] ==> [XmlBuilder]
        public Stack XmlStartElement(Stack stack)
        {
            stack.Push(new XmlBuilder());
            return stack;
        }

        //[XmlBuilder, ident] ==> [XmlBuilder]
        //[XmlCloser, indent] ==> [XmlCloser]
        public Stack XmlIdent(Stack stack)
        {
            var ident = (string) stack.Pop();
            object x = stack.Pop();
            if (x is XmlBuilder)
            {
                var xeb = (XmlBuilder) x;
                xeb.SetName(ident);
                stack.Push(xeb);
            }
            if (x is XmlCloser)
            {
                stack.Push(x);
            }
            return stack;
        }

        //[ident] ==> [AttrBuilder]
        public Stack XmlAttrName(Stack s)
        {
            var ident = (string) s.Pop();
            var ab = new AttrBuilder();
            ab.SetAttrName(ident);
            s.Push(ab);
            return s;
        }

        //[XmlBuilder, AttrBuilder] ==> [XmlBuilder]    // add a finished XmlAttribute to the XmlBuilder
        public Stack XmlAttrVal(Stack stack)
        {
            var val = (string) stack.Pop();
            var ab = (AttrBuilder)stack.Pop();
            ab.SetAttrValue(val);
            var xeb = (XmlBuilder) stack.Pop();
            xeb.AddAttr(ab.Complete());
            stack.Push(xeb);
            return stack;
        }

        //[XmlBuilder, string] ==> [XmlBuilder]         // add a #text to the XmlBuilder
        public Stack XmlText(Stack stack)
        {
            var text = (string) stack.Pop();
            var xeb = (XmlBuilder) stack.Pop();
            xeb.AddMixed(text);
            stack.Push(xeb);
            return stack;
        }

        //[XmlBuilder, XmlBuilder] ==> [XmlBuilder]     // i.e. insert it into enclosing element if there is one
        //[XmlBuilder] ==> [XmlElement]                 // otherwise construct a finished XmlElement on the stack
        public Stack XmlUniEnd(Stack stack)
        {
            var xeb = (XmlBuilder) stack.Pop();
            if (stack.Count != 0 && stack.Peek() is XmlBuilder)
            {
                var xeb2 = (XmlBuilder)stack.Pop();
                xeb2.AddChild(xeb.Complete());
                stack.Push(xeb2);
            }
            else
            {
                stack.Push(xeb.Complete());
            }
            return stack;
        }

        //[XmlBuilder] ==> [XmlCloser]
        public Stack XmlStartEndTag(Stack stack)
        {
            var xeb = (XmlBuilder) stack.Pop();
            var c = new XmlCloser(xeb.Complete());
            stack.Push(c);
            return stack;
        }

        //[XmlBuilder] ==> [XmlBuilder]
        //[XmlBuilder, XmlCloser] ==> [XElement]      // insert a finished XmlElement into the enclosing element builder
        //[XmlCloser] ==> [XElement]                  // otherwise create the finished XmlElement
        public Stack XmlEndBrace(Stack s)
        {
            if (s.Peek() is XmlBuilder)
            {
                // nothing required. It's the end of the start tag of the element
            }
            else if (s.Peek() is XmlCloser)
            {
                var xc = (XmlCloser)s.Pop();
                if (s.Count > 0 && s.Peek() is XmlBuilder)
                {
                    var xeb = (XmlBuilder)s.Pop();
                    xeb.AddChild(xc.Complete());
                    s.Push(xeb);
                }
                else
                {
                    s.Push(xc.Complete());
                }
            }
            return s;
        }
    }
}