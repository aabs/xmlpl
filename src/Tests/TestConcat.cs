using System.Diagnostics;
using System.Xml.Linq;
using NUnit.Framework;
using xmlpl_parser;

namespace Tests
{
    [TestFixture]
    public class TestConcat
    {
        #region Setup/Teardown

        [SetUp]
        public void SetUp()
        {
            Machine = new StackMachine();
        }

        [TearDown]
        public void TearDown()
        {
            Machine = null;
        }

        #endregion

        protected StackMachine Machine { get; set; }


        [Test, Category("Regression")]
        public void TestCreateComplexXmlFragment()
        {
            /*
            The XML:
             * 
             * <root id="someId">
             *   <child1 id="child1id" foo="bar" />
             *   some random text
             *   <child2 id="child2id" foo="baz">eric</child2>
             *   some more text
             * </root>
             * */
            Machine.EnqueueBuiltinFunction("XmlStartElement");
            Machine.CreatePusherFunction("root");
            Machine.EnqueueBuiltinFunction("XmlIdent");
            Machine.CreatePusherFunction("id");
            Machine.EnqueueBuiltinFunction("XmlAttrName");
            Machine.CreatePusherFunction("someId");
            Machine.EnqueueBuiltinFunction("XmlAttrVal");
            Machine.EnqueueBuiltinFunction("XmlEndBrace");
            Debug.WriteLine(Machine.StackView);
            Machine.EnqueueBuiltinFunction("XmlStartElement");
            Machine.CreatePusherFunction("child1");
            Machine.EnqueueBuiltinFunction("XmlIdent");
            Machine.CreatePusherFunction("id");
            Machine.EnqueueBuiltinFunction("XmlAttrName");
            Machine.CreatePusherFunction("child1id");
            Machine.EnqueueBuiltinFunction("XmlAttrVal");
            Machine.CreatePusherFunction("foo");
            Machine.EnqueueBuiltinFunction("XmlAttrName");
            Machine.CreatePusherFunction("bar");
            Machine.EnqueueBuiltinFunction("XmlAttrVal");
            Machine.EnqueueBuiltinFunction("XmlUniEnd");

            Machine.CreatePusherFunction("some random text");
            Machine.EnqueueBuiltinFunction("XmlText");

            Machine.EnqueueBuiltinFunction("XmlStartElement");
            Machine.CreatePusherFunction("child2");
            Machine.EnqueueBuiltinFunction("XmlIdent");
            Machine.CreatePusherFunction("id");
            Machine.EnqueueBuiltinFunction("XmlAttrName");
            Machine.CreatePusherFunction("child2id");
            Machine.EnqueueBuiltinFunction("XmlAttrVal");
            Machine.CreatePusherFunction("foo");
            Machine.EnqueueBuiltinFunction("XmlAttrName");
            Machine.CreatePusherFunction("baz");
            Machine.EnqueueBuiltinFunction("XmlAttrVal");
            Machine.EnqueueBuiltinFunction("XmlEndBrace");

            Machine.CreatePusherFunction("eric");
            Machine.EnqueueBuiltinFunction("XmlText");

            Machine.EnqueueBuiltinFunction("XmlStartEndTag");
            Machine.CreatePusherFunction("child2");
            Machine.EnqueueBuiltinFunction("XmlIdent");
            Machine.EnqueueBuiltinFunction("XmlEndBrace");

            Machine.CreatePusherFunction("some more text");
            Machine.EnqueueBuiltinFunction("XmlText");

            Machine.EnqueueBuiltinFunction("XmlStartEndTag");
            Machine.CreatePusherFunction("root");
            Machine.EnqueueBuiltinFunction("XmlIdent");
            Machine.EnqueueBuiltinFunction("XmlEndBrace");

            Machine.Run();
            Assert.IsTrue(Machine.Stack.Count == 1);
            Assert.IsTrue(Machine.Stack.Peek() is XElement);
        }

        [Test, Category("Regression")]
        public void TestCreateXmlFragment()
        {
            Machine.EnqueueBuiltinFunction("XmlStartElement");
            Machine.CreatePusherFunction("element");
            Machine.EnqueueBuiltinFunction("XmlIdent");
            Machine.EnqueueBuiltinFunction("XmlUniEnd");
            Machine.Run();
            Assert.IsTrue(Machine.Stack.Count == 1);
            Assert.IsTrue(Machine.Stack.Peek() is XElement);
        }
    }
}