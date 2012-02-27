using System.Collections.Generic;

namespace xmlpl_parser
{
    public class ParseContext
    {
        public ParseContext()
        {
            SymTab = new Dictionary<string, SymTabEntry>();
        }
        public string ModuleName { get; set; }
        public Dictionary<string, SymTabEntry> SymTab { get; set; } 
    }
}