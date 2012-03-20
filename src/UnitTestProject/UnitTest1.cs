using System;
using System.Diagnostics;
using System.IO;
using System.Text;
using Antlr.Runtime;
using Antlr.Runtime.Tree;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using xmlpl_parser;

namespace UnitTestProject
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestAttribute()
        {
            var parser = GetNewParser(@"a='b'");
            try
            {
                var x = parser.attribute();
                WriteToDotFile(x.Tree, "AST-attr.dot");
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
        [TestMethod]
        public void TestSimpleElement()
        {
            var parser = GetNewParser(@"<a>");
            try
            {
                var x = parser.element();
                WriteToDotFile(x.Tree, "AST-simple-element.dot");
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
        [TestMethod]
        public void TestElementWithAttrs()
        {
            var parser = GetNewParser(@"<a x='y' c='d'>");
            try
            {
                var x = parser.element();
                WriteToDotFile(x.Tree, "AST-simple-element-with-one-attr.dot");
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
        [TestMethod]
        public void TestProperElement()
        {
            var parser = GetNewParser(@"<a x='y' c='d'></a>");
            try
            {
                var x = parser.content();
                WriteToDotFile(x.Tree, "AST-proper-element.dot");
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
        [TestMethod]
        public void TestMatchExpression()
        {
            var parser = GetNewParser(@"x =? <a x='y' c='d'></a>");
            try
            {
                var x = parser.matchOperation();
                WriteToDotFile(x.Tree, "AST-match.dot");
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
        internal mccarthyParser GetNewParser(string spec)
        {
            var lex = new mccarthyLexer(new ANTLRStringStream(spec));
            var tokens = new CommonTokenStream(lex);
            return new mccarthyParser(tokens);
        }

        internal void WriteToDotFile(CommonTree tree, string fileName)
        {
            var gen = new DotTreeGenerator();
            string st = gen.ToDot(tree);
            File.WriteAllText(@"C:\dat\repository\personal\dev\projects\loblang\test-documents\" + fileName, st);
        }
    }
}
