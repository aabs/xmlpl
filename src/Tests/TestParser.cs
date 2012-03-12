using System;
using System.Diagnostics;
using System.IO;
using System.Text;
using Antlr.Runtime;
using Antlr.Runtime.Tree;
using NUnit.Framework;
using xmlpl_parser;

namespace Tests
{
    public class DebugRepeater : TextWriter
    {
        public override Encoding Encoding
        {
            get { return Encoding.Default; }
        }

        public override void WriteLine(string value, params object[] args)
        {
            Debug.WriteLine(string.Format(value, args));
        }

        public override void Write(string value)
        {
            Debug.WriteLine(value);
        }
    }

    [TestFixture]
    public class TestParser
    {
        [Test, Category("Regression")]
        public void TestCreate()
        {
            string spec = @"module blah .
Main(A, B) {
    A = <something>blah</something>;
}
";
            var lex = new loblangLexer(new ANTLRStringStream(spec));
            var tokens = new CommonTokenStream(lex);

            var parser = new loblangParser(tokens);

            try
            {
                loblangParser.module_return x = parser.module();
                Assert.False(parser.Failed);
                Debug.WriteLine(x.Tree.ToStringTree());
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }

        [Test, Category("Regression")]
        public void TestCreateDot()
        {
            string spec = @"
module blah ;
import std ;
import xml ;
EntryPoint(doc:Document, addr:Element){
    x = y;
    $doc/eric/ernie == x;
    $a/x/y => b;
    $e/f/g =< f;
    x =? <address />;
    y =? <address>some <b>text</b> here</address>;
}
Helper(elem:Element, val:Int){}
";
            var lex = new mccarthyLexer(new ANTLRStringStream(spec));
            var tokens = new CommonTokenStream(lex);

            var parser = new mccarthyParser(tokens);

            try
            {
                mccarthyParser.module_return x = parser.module();
                CommonTree tree = x.Tree;
                var gen = new DotTreeGenerator();
                string st = gen.ToDot(tree);
                File.WriteAllText(@"C:\dat\repository\personal\dev\projects\loblang\test-documents\AST.dot", st);
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }


        [Test, Category("Regression")]
        public void TestParseCOA()
        {
            var lex =
                new loblangLexer(
                    new ANTLRFileStream(
                        @"F:\backup - fluorine\20120306\shared.datastore\repository\personal\dev\misc\dev\xmlpl\test-documents\1. change_of_address.txt"));
            var tokens = new CommonTokenStream(lex);

            var parser = new loblangParser(tokens);

            try
            {
                parser.module();
                Assert.False(parser.Failed);
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
    }
}