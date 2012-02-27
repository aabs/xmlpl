using System.Xml.Linq;

namespace xmlpl_parser
{
    public class AttrBuilder
    {
        public void SetAttrName(string ident)
        {
            Name = ident;
        }

        public string Name { get; set; }
        public string Value { get; set; }

        internal void SetAttrValue(string val)
        {
            Value = val;
        }

        public XAttribute Complete()
        {
            return new XAttribute(Name, Value);
        }
    }
}