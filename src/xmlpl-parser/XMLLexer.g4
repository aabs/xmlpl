/*
ignores Entity Declarations like <!ENTITY ...>, Notation Declarations   '<!NOTATION'
*/
lexer grammar XMLLexer;

// Default "mode": Everything OUTSIDE of a tag
OPEN        :   '<'                     {pushMode(INSIDE);} ;
SPECIAL_OPEN:   '<?'                    {pushMode(INSIDE);} ;
XMLDecl     :   '<?xml' S               {pushMode(INSIDE);} ;
COMMENT     :   '<!--' .* '-->'         {skip();} ;
CDATA       :   '<![CDATA[' .* ']]>' ;
BAD_COMMENT1:   '<!--' .* '--->'        {System.err.println("Can't have ---> end comment");} {skip();} ;
BAD_COMMENT2:   '<!--' ('--'|.)* '-->'  {System.err.println("Can't have -- in comment");} {skip();} ;
DTD         :   '<!' .* '>'             {skip();} ; // scarf but ignore all DTD stuff
EntityRef   :   '&' Name ';' ;
CharRef     :   '&#' DIGIT+ ';'
            |   '&#x' HEXDIGIT+ ';'
            ;
TEXT        :   ~('<'|'&')+ ;           // match any 16 bit char minus < and &

// ----------------- Everything INSIDE of a tag ---------------------

mode INSIDE;

CLOSE       :   '>' {popMode();} ;
SPECIAL_CLOSE:  '?>' {popMode();} ;
SLASH_CLOSE :   '/>' {popMode();} ;
SLASH       :   '/' ;
EQUALS      :   '=' ;
STRING      :   '"' .* '"'
            |   '\'' .* '\''
            ;
Name        :   NameStartChar NameChar* ;
S           :   (' '|'\t'|'\r'|'\n')    {skip();} ;

fragment
HEXDIGIT    :   ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
NameChar    :   NameStartChar
            |   '-' | '.' | DIGIT 
            |   '\u00B7'
            |   '\u0300'..'\u036F'
            |   '\u203F'..'\u2040'
            ;

fragment
NameStartChar
            :   ':' | 'A'..'Z' | '_' | 'a'..'z'
            |   '\u00C0'..'\u00D6'
            |   '\u00D8'..'\u00F6'
            |   '\u00F8'..'\u02FF'
            |   '\u0370'..'\u037D'
            |   '\u037F'..'\u1FFF'
            |   '\u200C'..'\u200D'
            |   '\u2070'..'\u218F' 
            |   '\u2C00'..'\u2FEF' 
            |   '\u3001'..'\uD7FF' 
            |   '\uF900'..'\uFDCF' 
            |   '\uFDF0'..'\uFFFD'
            ; // ignores | ['\u10000-'\uEFFFF] ;

fragment
DIGIT       :   '0'..'9' ;
