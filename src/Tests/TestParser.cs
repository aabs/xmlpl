using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using NUnit.Framework;
using xmlpl_parser;

namespace Tests
{
    [TestFixture]
    public class TestParser
    {

        [Test, Category("Regression")]
        public void TestCreate()
        {
            var spec = @"module blah .
Main(A, B) {
    $A/blah == <something/>.
}";
            Parser parser = new Parser(new Scanner(new MemoryStream(ASCIIEncoding.Default.GetBytes(spec))));
            parser.Parse();
            if (parser.errors.count > 0)
            {
                Assert.Fail();
            }
            
        }
  
    }
}
