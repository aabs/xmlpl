using System.Collections;

namespace xmlpl_parser
{
    public interface IOperationProvider
    {
        Stack NoOp(Stack s);
        Stack IntAdd(Stack s);
        Stack IntMult(Stack s);
        Stack XmlStartElement(Stack stack);
        Stack XmlIdent(Stack stack);
        Stack XmlAttrName(Stack s);
        Stack XmlAttrVal(Stack stack);
        Stack XmlText(Stack stack);
        Stack XmlUniEnd(Stack stack);
        Stack XmlStartEndTag(Stack stack);
        Stack XmlEndBrace(Stack s);
    }
}