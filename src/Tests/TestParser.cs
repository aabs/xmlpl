using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
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
function Main(A, B) {
    A = <something>blah</something>;
}
";
            Parser parser = new Parser(new Scanner(new MemoryStream(ASCIIEncoding.Default.GetBytes(spec))));
            parser.errors.errorStream = new DebugRepeater();
            parser.Parse();
            if (parser.errors.count > 0)
            {
                Assert.Fail();
            }
            
        }
  

        [Test, Category("Regression")]
        public void TestParseCOA()
        {
            Parser parser = new Parser(new Scanner(File.OpenRead(@"F:\backup - fluorine\20120306\shared.datastore\repository\personal\dev\misc\dev\xmlpl\test-documents\1. change_of_address.txt")));
            parser.errors.errorStream = new DebugRepeater();
            parser.Parse();
            if (parser.errors.count > 0)
            {
                Assert.Fail();
            }
            
        }
    }
}
