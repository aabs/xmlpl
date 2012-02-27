using System.Xml.Linq;

namespace xmlpl_parser
{
    public class XmlCloser
    {
        public XmlCloser(XElement e)
        {
            Element = e;
        }

        public XElement Complete()
        {
            return Element;
        }

        public XElement Element { get; set; }
    }
}