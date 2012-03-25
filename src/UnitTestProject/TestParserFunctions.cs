using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using Antlr.Runtime;
using Antlr.Runtime.Tree;
using NUnit.Framework;
using xmlpl_parser;

namespace UnitTestProject
{
    [TestFixture]
    public class TestParserFunctions
    {
        internal mccarthyParser GetNewParser(string spec)
        {
            var lex = new mccarthyLexer(new ANTLRStringStream(spec));
            var tokens = new CommonTokenStream(lex);
            return new mccarthyParser(tokens);
        }

        internal void WriteToDotFile(CommonTree tree,
                                     string fileName)
        {
            var gen = new DotTreeGenerator();
            string st = gen.ToDot(tree);
            string path =
                Path.Combine(@"C:\dat\repository\personal\dev\projects\loblang\test-documents\output-dot-files",
                             fileName);
            File.WriteAllText(path,
                              st);
        }

        internal static void TestForNodesAndArcs(string fileName,
                                                 IEnumerable<Tuple<string, string>> pairs)
        {
            string path =
                Path.Combine(@"C:\dat\repository\personal\dev\projects\loblang\test-documents\output-dot-files",
                             fileName);
            string content = File.ReadAllText(path);
            foreach (var pair in pairs)
            {
                string sourceNodeName = pair.Item1;
                string destNodeName = pair.Item2;
                Assert.IsTrue(content.Contains(string.Format("[label=\"{0}\"];",
                                                             sourceNodeName)),
                              string.Format("could not find '{0}' node name definition",
                                            sourceNodeName));
                Assert.IsTrue(content.Contains(string.Format("[label=\"{0}\"];",
                                                             destNodeName)),
                              string.Format("could not find '{0}' node name definition",
                                            destNodeName));
                Assert.IsTrue(content.Contains(string.Format("// \"{0}\" -> \"{1}\"",
                                                             sourceNodeName,
                                                             destNodeName)),
                              string.Format("unable to find an arc between '{0}' and '{1}'",
                                            sourceNodeName,
                                            destNodeName));
            }
        }


        private static IEnumerable DirectTests()
        {
            yield return CreateTest("a=\"b\"", parser => parser.attribute().Tree,
                                    new[] {"XMLATTR -> a", "XMLATTR -> VALSTR", @"VALSTR -> \\""b\\"""});
            yield return CreateTest("a=\"b\"", parser => parser.attribute().Tree,
                                    new[] {"XMLATTR -> a", "XMLATTR -> VALSTR", @"VALSTR -> \\""b\\"""});
            yield return CreateTest("<a>", parser => parser.element().Tree,
                                    new[] {"XMLOPENELEM -> a", "XMLOPENELEM -> XMLATTRS"});
            yield return CreateTest("<a x='y' c='d'>", parser => parser.element().Tree,
                                    new[] { "XMLOPENELEM -> a", "XMLOPENELEM -> XMLATTRS", "XMLATTR -> x",
                                            "XMLATTR -> c", "XMLATTR -> VALSTR", "VALSTR -> 'y'", "VALSTR -> 'd'" });
            yield return CreateTest("<a x='y' c='d'></a>", parser => parser.element().Tree,
                                    new[] { "XMLOPENELEM -> a", "XMLOPENELEM -> XMLATTRS", "XMLATTR -> x", "XMLATTR -> c",
                                            "XMLATTR -> VALSTR", "VALSTR -> 'y'", "VALSTR -> 'd'" });
            yield return CreateTest("import blah;", parser => parser.importDeclaration().Tree,
                                    new[] { "IMPORTDECL -> blah"});
            yield return CreateTest("some_function(a, 2, 'hello')", parser => parser.importDeclaration().Tree,
                                    new[] { "INVOCATION -> some_function", "INVOCATION -> PARAMETERS", "PARAMETERS -> PARAMETER", "PARAMETER -> VALINT", "PARAMETER -> VARREF", "PARAMETER -> VALSTR" }); 
        }

        private static IEnumerable FileBasedTests()
        {
            yield return CreateTest("match.txt",
                                    parser => parser.matchOperation().Tree,
                                    new[]
                                        {
                                            "MATCH -> VARREF", "VARREF -> x", "XMLATTR -> x", "XMLATTR -> c",
                                            "XMLATTR -> VALSTR", "VALSTR -> 'y'", "VALSTR -> 'd'", "XML -> XMLOPENELEM",
                                            "XML -> XMLCLOSEELEM", "XMLCLOSEELEM -> a"
                                        });
            yield return CreateTest("match - statement.txt",
                                    parser => parser.statement().Tree,
                                    new[]
                                        {
                                            "MATCH -> VARREF", "VARREF -> x", "XMLATTR -> x", "XMLATTR -> c",
                                            "XMLATTR -> VALSTR", "VALSTR -> 'y'", "VALSTR -> 'd'", "XML -> XMLOPENELEM",
                                            "XML -> XMLCLOSEELEM", "XMLCLOSEELEM -> a"
                                        });
            yield return CreateTest("module.txt",
                                    parser => parser.module().Tree,
                                    new[]
                                        {
                                            "ROOT -> MODULEDECL", "ROOT -> Imports", "Imports -> IMPORTDECL", "IMPORTDECL -> std",
                                            "IMPORTDECL -> xml", "XMLATTR -> postcode", "XMLATTR -> VALSTR",
                                            "VALSTR -> 'blah'", "XML -> landlord", "XMLCLOSEELEM -> address",
                                            "FUNCDEC -> EntryPoint",
                                        });
        }


        private static TestCaseData CreateTest(string inputFile,
                                               Expression<Func<mccarthyParser, CommonTree>> accessor,
                                               string[] strings)
        {
            return new TestCaseData(inputFile,
                                    accessor,
                                    strings);
        }

        public void MainTestBody(string sourceFragment,
                                 Expression<Func<mccarthyParser, CommonTree>> accessor,
                                 IEnumerable<string> tests)
        {
            Func<mccarthyParser, CommonTree> fn = accessor.Compile();
            string outPath = @"C:\dat\repository\personal\dev\projects\loblang\test-documents\output-dot-files";
            mccarthyParser parser = GetNewParser(sourceFragment);
            CommonTree astTree = fn(parser);
            string tmpFileName = Path.Combine(outPath,
                                              "temp.dot");
            WriteToDotFile(astTree,
                           tmpFileName);
            IEnumerable<Tuple<string, string>> tuples = tests.Select(s => s.Cut("->"));
            TestForNodesAndArcs(tmpFileName,
                                tuples);
        }

        [Test, TestCaseSource("DirectTests")]
        public void DirectTests(string sourceFragment,
                                Expression<Func<mccarthyParser, CommonTree>> accessor,
                                IEnumerable<string> tests)
        {
            MainTestBody(sourceFragment,
                         accessor,
                         tests);
        }

        [Test, TestCaseSource("FileBasedTests")]
        public void FileBasedTests(string inputFile,
                                   Expression<Func<mccarthyParser, CommonTree>> accessor,
                                   IEnumerable<string> tests)
        {
            string docPath = @"C:\dat\repository\personal\dev\projects\loblang\test-documents\input-documents";
            string sourceFragment = File.ReadAllText(Path.Combine(docPath,
                                                                  inputFile));
            MainTestBody(sourceFragment,
                         accessor,
                         tests);
        }


    }

    public static class TestDataGenerator
    {
        public static Tuple<string, string> Cut(this string str,
                                                string sep)
        {
            int index = str.IndexOf(sep);
            if (index > 1)
            {
                string fromNode = str.Substring(0,
                                                index).Trim();
                string toNode = str.Substring(index + sep.Length).Trim();
                return Tuple.Create(fromNode,
                                    toNode);
            }
            throw new ApplicationException("malformed arc specification");
        }
    }
}