// no DTD stuff.
parser grammar XMLParser;

options { tokenVocab=XMLLexer; }

document    :   prolog? content ;

prolog      :   XMLDecl attribute* '?>' ;

/*
OR: explicit checks
prolog :    XMLDecl versionInfo encodingDecl? standalone? '?>' ;
versionInfo : {_input.LT(1).getText().equals("version")}? Name '=' STRING ;
encodingDecl : {_input.LT(1).getText().equals("encoding")}? Name '=' STRING ; 
standalone : {_input.LT(1).getText().equals("standalone")}? Name '=' STRING ;
*/

content     :  (element | reference | CDATA | TEXT)* ;

element     :   '<' Name attribute* '>'
            |   '<?' Name attribute* '?>' // deal with stuff like xml-stylesheet 
            |   '<' '/' Name '>'
            |   '<' Name attribute* '/>'
            ;

reference   :   EntityRef | CharRef ;

attribute   :   Name '=' STRING ;
