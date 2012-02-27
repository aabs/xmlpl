using System.Collections.Generic;
using System.Xml.Linq;

namespace xmlpl_parser
{
    public class XmlBuilder
    {
        public string  Name { get; set; }
        public List<XNode> Content = new List<XNode>(); 
        public List<XAttribute> Attributes = new List<XAttribute>(); 

        internal void SetName(string ident)
        {
            Name = ident;
        }

        internal void AddAttr(XAttribute ab)
        {
            Attributes.Add(ab);
        }

        public void AddMixed(string text)
        {
            Content.Add(new XText(text));
        }

        public XElement Complete()
        {
            var result = new XElement(Name);
            Attributes.ForEach(attribute => result.SetAttributeValue(attribute.Name, attribute.Value));
            Content.ForEach(result.Add);
            return result;
        }

        public void AddChild(XElement e)
        {
            Content.Add(e);
        }
    }
}