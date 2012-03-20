using System;
using System.Collections.Generic;
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
                TestForNodesAndArcs("AST-attr.dot", 
                    new[]
                        {
                            Tuple.Create("XMLATTR", "a"),
                            Tuple.Create("XMLATTR", "VALSTR"),
                            Tuple.Create("VALSTR", "'b'")
                        });
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
                TestForNodesAndArcs("AST-simple-element.dot", 
                    new[]
                        {
                            Tuple.Create("XMLOPENELEM", "a"),
                            Tuple.Create("XMLOPENELEM", "XMLATTRS"),
                        });
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
                TestForNodesAndArcs("AST-simple-element-with-one-attr.dot", 
                    new[]
                        {
                            Tuple.Create("XMLATTR", "x"),
                            Tuple.Create("XMLATTR", "c"),
                            Tuple.Create("XMLATTR", "VALSTR"),
                            Tuple.Create("VALSTR", "'y'"),
                            Tuple.Create("VALSTR", "'d'"),
                        });
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
                TestForNodesAndArcs("AST-proper-element.dot", 
                    new[]
                        {
                            Tuple.Create("XMLATTR", "x"),
                            Tuple.Create("XMLATTR", "c"),
                            Tuple.Create("XMLATTR", "VALSTR"),
                            Tuple.Create("VALSTR", "'y'"),
                            Tuple.Create("VALSTR", "'d'"),
                            Tuple.Create("XML", "XMLOPENELEM"),
                            Tuple.Create("XML", "XMLCLOSEELEM"),
                            Tuple.Create("XMLCLOSEELEM", "a"),
                        });
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
                TestForNodesAndArcs("AST-match.dot", 
                    new[]
                        {
                            Tuple.Create("MATCH", "VARREF"),
                            Tuple.Create("VARREF", "x"),
                            Tuple.Create("XMLATTR", "x"),
                            Tuple.Create("XMLATTR", "c"),
                            Tuple.Create("XMLATTR", "VALSTR"),
                            Tuple.Create("VALSTR", "'y'"),
                            Tuple.Create("VALSTR", "'d'"),
                            Tuple.Create("XML", "XMLOPENELEM"),
                            Tuple.Create("XML", "XMLCLOSEELEM"),
                            Tuple.Create("XMLCLOSEELEM", "a"),
                        });
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
        [TestMethod]
        public void TestMatchStatement()
        {
            var parser = GetNewParser(@"x =? <a x='y' c='d'></a>;");
            try
            {
                var x = parser.statement();
                WriteToDotFile(x.Tree, "AST-match-statement.dot");
                TestForNodesAndArcs("AST-match-statement.dot", 
                    new[]
{
                            Tuple.Create("MATCH", "VARREF"),
                            Tuple.Create("VARREF", "x"),
                            Tuple.Create("XMLATTR", "x"),
                            Tuple.Create("XMLATTR", "c"),
                            Tuple.Create("XMLATTR", "VALSTR"),
                            Tuple.Create("VALSTR", "'y'"),
                            Tuple.Create("VALSTR", "'d'"),
                            Tuple.Create("XML", "XMLOPENELEM"),
                            Tuple.Create("XML", "XMLCLOSEELEM"),
                            Tuple.Create("XMLCLOSEELEM", "a"),
                        });
            }
            catch (RecognitionException e)
            {
                Console.Error.WriteLine(e.StackTrace);
                Assert.Fail(e.Message);
            }
        }
        [TestMethod]
        public void TestModule()
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
    y =? <address addr1='blah' addr2='blah' region='blah' postcode='blah' country='blah'><landlord name='joe blow' /></address>;
}
Helper(elem:Element, val:Int){}
";
            var parser = GetNewParser(spec);
            try
            {
                var x = parser.module();
                WriteToDotFile(x.Tree, "AST-module.dot");
                TestForNodesAndArcs("AST-module.dot", 
                    new[]
                        {
                            Tuple.Create("ROOT", "module"),
                            Tuple.Create("ROOT", "Imports"),
                            Tuple.Create("Imports", "import"),
                            Tuple.Create("import", "std"),
                            Tuple.Create("import", "xml"),
                            Tuple.Create("XMLATTR", "postcode"),
                            Tuple.Create("XMLATTR", "VALSTR"),
                            Tuple.Create("VALSTR", "'blah'"),
                            Tuple.Create("XML", "landlord"),
                            Tuple.Create("XMLCLOSEELEM", "address"),
                            Tuple.Create("FUNCDEC", "EntryPoint"),
                        });
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
        internal static void TestForNodesAndArcs(string fileName, IEnumerable<Tuple<string, string>> pairs )
        {
            var content = File.ReadAllText(@"C:\dat\repository\personal\dev\projects\loblang\test-documents\" + fileName);
            foreach (var pair in pairs)
            {
                var sourceNodeName = pair.Item1;
                var destNodeName = pair.Item2;
                Assert.IsTrue(content.Contains(string.Format("[label=\"{0}\"];", sourceNodeName)), string.Format("could not find '{0}' node name definition", sourceNodeName));
                Assert.IsTrue(content.Contains(string.Format("[label=\"{0}\"];", destNodeName)), string.Format("could not find '{0}' node name definition", destNodeName));
                Assert.IsTrue(content.Contains(string.Format("// \"{0}\" -> \"{1}\"", sourceNodeName, destNodeName)), string.Format("unable to find an arc between '{0}' and '{1}'", sourceNodeName, destNodeName));
            }
        }
    }
}
