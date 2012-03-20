using Antlr.Runtime;

namespace xmlpl_parser
{
    public partial class mccarthyLexer
    {
        public mccarthyLexer(ICharStream input, XmlParsingState state) : this(input)
        {
            State = state;
        }

        private XmlParsingState State { get; set; }
    }
}