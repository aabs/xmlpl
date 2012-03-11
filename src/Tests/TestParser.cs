using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using Antlr.Runtime;
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
            var spec = @"module blah .
Main(A, B) {
    A = <something>blah</something>;
}
";
            loblangLexer lex = new loblangLexer(new ANTLRStringStream(spec));
            CommonTokenStream tokens = new CommonTokenStream(lex);

            loblangParser parser = new loblangParser(tokens);

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
  

        [Test, Category("Regression")]
        public void TestParseCOA()
        {
            loblangLexer lex = new loblangLexer(new ANTLRFileStream(@"F:\backup - fluorine\20120306\shared.datastore\repository\personal\dev\misc\dev\xmlpl\test-documents\1. change_of_address.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lex);

            loblangParser parser = new loblangParser(tokens);

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
