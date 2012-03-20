using Antlr.Runtime;

namespace xmlpl_parser
{
    public partial class mccarthyParser
    {
        XmlParsingState State { get; set; }
        public mccarthyParser( ITokenStream input, XmlParsingState state) : this(input)
        {
            State = state;
        }
    }
}
