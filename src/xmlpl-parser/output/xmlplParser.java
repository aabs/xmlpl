// $ANTLR 3.4 F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g 2012-03-11 14:55:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class xmlplParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'!='", "'$'", "'&#'", "'&'", "'('", "')'", "','", "'->'", "'-><'", "'->>'", "'.'", "'/'", "'/>'", "';'", "'<'", "'</'", "'<?'", "'='", "'=<'", "'=='", "'=>'", "'=?'", "'>'", "'?'", "'?>'", "'import'", "'module'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int OCTAL_ESC=12;
    public static final int STRING=13;
    public static final int UNICODE_ESC=14;
    public static final int WS=15;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public xmlplParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public xmlplParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return xmlplParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g"; }



    // $ANTLR start "moduleDef"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:60:1: moduleDef : 'module' ID '.' ;
    public final void moduleDef() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:61:2: ( 'module' ID '.' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:61:4: 'module' ID '.'
            {
            match(input,42,FOLLOW_42_in_moduleDef559); 

            match(input,ID,FOLLOW_ID_in_moduleDef561); 

            match(input,26,FOLLOW_26_in_moduleDef563); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "moduleDef"



    // $ANTLR start "importDef"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:64:1: importDef : 'import' ID '.' ;
    public final void importDef() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:64:11: ( 'import' ID '.' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:64:13: 'import' ID '.'
            {
            match(input,41,FOLLOW_41_in_importDef573); 

            match(input,ID,FOLLOW_ID_in_importDef575); 

            match(input,26,FOLLOW_26_in_importDef577); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "importDef"



    // $ANTLR start "functionDefinition"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:67:1: functionDefinition : ID '(' argList ')' '{' statementList '}' ;
    public final void functionDefinition() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:68:2: ( ID '(' argList ')' '{' statementList '}' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:68:4: ID '(' argList ')' '{' statementList '}'
            {
            match(input,ID,FOLLOW_ID_in_functionDefinition588); 

            match(input,20,FOLLOW_20_in_functionDefinition590); 

            pushFollow(FOLLOW_argList_in_functionDefinition592);
            argList();

            state._fsp--;


            match(input,21,FOLLOW_21_in_functionDefinition594); 

            match(input,43,FOLLOW_43_in_functionDefinition596); 

            pushFollow(FOLLOW_statementList_in_functionDefinition599);
            statementList();

            state._fsp--;


            match(input,44,FOLLOW_44_in_functionDefinition602); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionDefinition"



    // $ANTLR start "statementList"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:73:1: statementList : ( statement )* ;
    public final void statementList() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:2: ( ( statement )* )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:4: ( statement )*
            {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:4: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==17||LA1_0==30||LA1_0==32||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList614);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statementList"



    // $ANTLR start "statement"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:77:1: statement : ( ID ( '=' expression )? | expression ) ';' ;
    public final void statement() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:2: ( ( ID ( '=' expression )? | expression ) ';' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:4: ( ID ( '=' expression )? | expression ) ';'
            {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:4: ( ID ( '=' expression )? | expression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==20) ) {
                    alt3=2;
                }
                else if ( (LA3_1==29||LA3_1==33) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==17||LA3_0==30||LA3_0==32||LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:6: ID ( '=' expression )?
                    {
                    match(input,ID,FOLLOW_ID_in_statement629); 

                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:9: ( '=' expression )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==33) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:10: '=' expression
                            {
                            match(input,33,FOLLOW_33_in_statement632); 

                            pushFollow(FOLLOW_expression_in_statement634);
                            expression();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:79:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement643);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            match(input,29,FOLLOW_29_in_statement646); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "expression"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:81:1: expression : ( xmlModifyingExpression | xmlPattern | xmlFragment | functionInvocation | xmlDocument );
    public final void expression() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:82:2: ( xmlModifyingExpression | xmlPattern | xmlFragment | functionInvocation | xmlDocument )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case ID:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:82:4: xmlModifyingExpression
                    {
                    pushFollow(FOLLOW_xmlModifyingExpression_in_expression656);
                    xmlModifyingExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:83:4: xmlPattern
                    {
                    pushFollow(FOLLOW_xmlPattern_in_expression661);
                    xmlPattern();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:84:4: xmlFragment
                    {
                    pushFollow(FOLLOW_xmlFragment_in_expression694);
                    xmlFragment();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:85:4: functionInvocation
                    {
                    pushFollow(FOLLOW_functionInvocation_in_expression699);
                    functionInvocation();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:86:4: xmlDocument
                    {
                    pushFollow(FOLLOW_xmlDocument_in_expression704);
                    xmlDocument();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "functionInvocation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:89:1: functionInvocation : ID '(' argList ')' ;
    public final void functionInvocation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:89:20: ( ID '(' argList ')' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:90:5: ID '(' argList ')'
            {
            match(input,ID,FOLLOW_ID_in_functionInvocation719); 

            match(input,20,FOLLOW_20_in_functionInvocation721); 

            pushFollow(FOLLOW_argList_in_functionInvocation723);
            argList();

            state._fsp--;


            match(input,21,FOLLOW_21_in_functionInvocation725); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "functionInvocation"



    // $ANTLR start "referenceOrBinding"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:93:1: referenceOrBinding : ID ( '=' expression )? ;
    public final void referenceOrBinding() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:94:2: ( ID ( '=' expression )? )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:95:5: ID ( '=' expression )?
            {
            match(input,ID,FOLLOW_ID_in_referenceOrBinding746); 

            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:95:8: ( '=' expression )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:95:9: '=' expression
                    {
                    match(input,33,FOLLOW_33_in_referenceOrBinding749); 

                    pushFollow(FOLLOW_expression_in_referenceOrBinding751);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "referenceOrBinding"



    // $ANTLR start "xmlModifyingExpression"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:98:1: xmlModifyingExpression : pathExpression ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation ) ;
    public final void xmlModifyingExpression() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:99:2: ( pathExpression ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation ) )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:99:4: pathExpression ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation )
            {
            pushFollow(FOLLOW_pathExpression_in_xmlModifyingExpression771);
            pathExpression();

            state._fsp--;


            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:100:2: ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            case 37:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            case 16:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:101:5: replaceOperation
                    {
                    pushFollow(FOLLOW_replaceOperation_in_xmlModifyingExpression781);
                    replaceOperation();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:102:5: appendOperation
                    {
                    pushFollow(FOLLOW_appendOperation_in_xmlModifyingExpression787);
                    appendOperation();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:103:5: prependOperation
                    {
                    pushFollow(FOLLOW_prependOperation_in_xmlModifyingExpression793);
                    prependOperation();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:104:5: matchOperation
                    {
                    pushFollow(FOLLOW_matchOperation_in_xmlModifyingExpression799);
                    matchOperation();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:105:5: moveOperation
                    {
                    pushFollow(FOLLOW_moveOperation_in_xmlModifyingExpression805);
                    moveOperation();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:106:5: moveFrontOperation
                    {
                    pushFollow(FOLLOW_moveFrontOperation_in_xmlModifyingExpression811);
                    moveFrontOperation();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:107:5: moveBackOperation
                    {
                    pushFollow(FOLLOW_moveBackOperation_in_xmlModifyingExpression817);
                    moveBackOperation();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:108:5: deleteOperation
                    {
                    pushFollow(FOLLOW_deleteOperation_in_xmlModifyingExpression823);
                    deleteOperation();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlModifyingExpression"



    // $ANTLR start "pathExpression"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:112:1: pathExpression : '$' path ;
    public final void pathExpression() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:113:2: ( '$' path )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:113:4: '$' path
            {
            match(input,17,FOLLOW_17_in_pathExpression837); 

            pushFollow(FOLLOW_path_in_pathExpression839);
            path();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pathExpression"



    // $ANTLR start "path"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:1: path : ID ( '/' ID )* ;
    public final void path() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:6: ( ID ( '/' ID )* )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:8: ID ( '/' ID )*
            {
            match(input,ID,FOLLOW_ID_in_path851); 

            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:11: ( '/' ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:12: '/' ID
            	    {
            	    match(input,27,FOLLOW_27_in_path854); 

            	    match(input,ID,FOLLOW_ID_in_path856); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "path"



    // $ANTLR start "replaceOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:119:1: replaceOperation : '==' value ;
    public final void replaceOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:120:2: ( '==' value )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:120:4: '==' value
            {
            match(input,35,FOLLOW_35_in_replaceOperation869); 

            pushFollow(FOLLOW_value_in_replaceOperation871);
            value();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "replaceOperation"



    // $ANTLR start "value"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:123:1: value : ( ID | '(' expression ')' | pathExpression | xmlFragment );
    public final void value() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:123:7: ( ID | '(' expression ')' | pathExpression | xmlFragment )
            int alt8=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:123:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_value881); 

                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:124:4: '(' expression ')'
                    {
                    match(input,20,FOLLOW_20_in_value886); 

                    pushFollow(FOLLOW_expression_in_value888);
                    expression();

                    state._fsp--;


                    match(input,21,FOLLOW_21_in_value890); 

                    }
                    break;
                case 3 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:125:4: pathExpression
                    {
                    pushFollow(FOLLOW_pathExpression_in_value895);
                    pathExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:126:7: xmlFragment
                    {
                    pushFollow(FOLLOW_xmlFragment_in_value903);
                    xmlFragment();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "appendOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:129:1: appendOperation : '=>' value ;
    public final void appendOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:130:2: ( '=>' value )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:130:5: '=>' value
            {
            match(input,36,FOLLOW_36_in_appendOperation915); 

            pushFollow(FOLLOW_value_in_appendOperation917);
            value();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "appendOperation"



    // $ANTLR start "prependOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:133:1: prependOperation : '=<' value ;
    public final void prependOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:134:2: ( '=<' value )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:134:4: '=<' value
            {
            match(input,34,FOLLOW_34_in_prependOperation928); 

            pushFollow(FOLLOW_value_in_prependOperation930);
            value();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prependOperation"



    // $ANTLR start "matchOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:137:1: matchOperation : '=?' xmlFragment ;
    public final void matchOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:138:2: ( '=?' xmlFragment )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:138:4: '=?' xmlFragment
            {
            match(input,37,FOLLOW_37_in_matchOperation941); 

            pushFollow(FOLLOW_xmlFragment_in_matchOperation943);
            xmlFragment();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "matchOperation"



    // $ANTLR start "moveOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:141:1: moveOperation : '->' pathExpression ;
    public final void moveOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:142:2: ( '->' pathExpression )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:142:4: '->' pathExpression
            {
            match(input,23,FOLLOW_23_in_moveOperation954); 

            pushFollow(FOLLOW_pathExpression_in_moveOperation956);
            pathExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "moveOperation"



    // $ANTLR start "moveFrontOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:145:1: moveFrontOperation : '-><' pathExpression ;
    public final void moveFrontOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:146:2: ( '-><' pathExpression )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:146:4: '-><' pathExpression
            {
            match(input,24,FOLLOW_24_in_moveFrontOperation967); 

            pushFollow(FOLLOW_pathExpression_in_moveFrontOperation969);
            pathExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "moveFrontOperation"



    // $ANTLR start "moveBackOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:149:1: moveBackOperation : '->>' pathExpression ;
    public final void moveBackOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:150:2: ( '->>' pathExpression )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:150:4: '->>' pathExpression
            {
            match(input,25,FOLLOW_25_in_moveBackOperation980); 

            pushFollow(FOLLOW_pathExpression_in_moveBackOperation982);
            pathExpression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "moveBackOperation"



    // $ANTLR start "deleteOperation"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:153:1: deleteOperation : '!=' ID ;
    public final void deleteOperation() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:154:2: ( '!=' ID )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:154:4: '!=' ID
            {
            match(input,16,FOLLOW_16_in_deleteOperation993); 

            match(input,ID,FOLLOW_ID_in_deleteOperation995); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "deleteOperation"



    // $ANTLR start "binding"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:157:1: binding : variableReference '=' expression ;
    public final void binding() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:157:9: ( variableReference '=' expression )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:157:11: variableReference '=' expression
            {
            pushFollow(FOLLOW_variableReference_in_binding1005);
            variableReference();

            state._fsp--;


            match(input,33,FOLLOW_33_in_binding1007); 

            pushFollow(FOLLOW_expression_in_binding1009);
            expression();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "binding"



    // $ANTLR start "variableReference"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:160:1: variableReference : ID ;
    public final void variableReference() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:161:2: ( ID )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:161:4: ID
            {
            match(input,ID,FOLLOW_ID_in_variableReference1020); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "variableReference"



    // $ANTLR start "argList"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:1: argList : variableReference ( '=' expression )? ( ',' variableReference ( '=' expression )? )* ;
    public final void argList() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:9: ( variableReference ( '=' expression )? ( ',' variableReference ( '=' expression )? )* )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:11: variableReference ( '=' expression )? ( ',' variableReference ( '=' expression )? )*
            {
            pushFollow(FOLLOW_variableReference_in_argList1030);
            variableReference();

            state._fsp--;


            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:29: ( '=' expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:30: '=' expression
                    {
                    match(input,33,FOLLOW_33_in_argList1033); 

                    pushFollow(FOLLOW_expression_in_argList1035);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:47: ( ',' variableReference ( '=' expression )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:48: ',' variableReference ( '=' expression )?
            	    {
            	    match(input,22,FOLLOW_22_in_argList1040); 

            	    pushFollow(FOLLOW_variableReference_in_argList1042);
            	    variableReference();

            	    state._fsp--;


            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:70: ( '=' expression )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==33) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:71: '=' expression
            	            {
            	            match(input,33,FOLLOW_33_in_argList1045); 

            	            pushFollow(FOLLOW_expression_in_argList1047);
            	            expression();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argList"



    // $ANTLR start "pattern"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:167:1: pattern : '?' ID ;
    public final void pattern() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:167:9: ( '?' ID )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:167:11: '?' ID
            {
            match(input,39,FOLLOW_39_in_pattern1063); 

            match(input,ID,FOLLOW_ID_in_pattern1065); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pattern"



    // $ANTLR start "xmlPattern"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:171:1: xmlPattern : '?' xmlFragment ;
    public final void xmlPattern() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:172:2: ( '?' xmlFragment )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:172:5: '?' xmlFragment
            {
            match(input,39,FOLLOW_39_in_xmlPattern1082); 

            pushFollow(FOLLOW_xmlFragment_in_xmlPattern1084);
            xmlFragment();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlPattern"



    // $ANTLR start "valueOf"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:174:1: valueOf : '{' ID '}' ;
    public final void valueOf() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:174:9: ( '{' ID '}' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:175:3: '{' ID '}'
            {
            match(input,43,FOLLOW_43_in_valueOf1099); 

            match(input,ID,FOLLOW_ID_in_valueOf1101); 

            match(input,44,FOLLOW_44_in_valueOf1103); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "valueOf"



    // $ANTLR start "xmlDocument"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:179:1: xmlDocument : '<?' ID xmlAttribute '?>' xmlObject ;
    public final void xmlDocument() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:180:2: ( '<?' ID xmlAttribute '?>' xmlObject )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:180:5: '<?' ID xmlAttribute '?>' xmlObject
            {
            match(input,32,FOLLOW_32_in_xmlDocument1121); 

            match(input,ID,FOLLOW_ID_in_xmlDocument1123); 

            pushFollow(FOLLOW_xmlAttribute_in_xmlDocument1125);
            xmlAttribute();

            state._fsp--;


            match(input,40,FOLLOW_40_in_xmlDocument1127); 

            pushFollow(FOLLOW_xmlObject_in_xmlDocument1129);
            xmlObject();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlDocument"



    // $ANTLR start "xmlFragment"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:184:1: xmlFragment : xmlObject ;
    public final void xmlFragment() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:185:2: ( xmlObject )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:185:6: xmlObject
            {
            pushFollow(FOLLOW_xmlObject_in_xmlFragment1148);
            xmlObject();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlFragment"



    // $ANTLR start "xmlObject"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:189:1: xmlObject : ( xmlStartTag xmlContent xmlEndTag | xmlUnaryTag );
    public final void xmlObject() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:190:2: ( xmlStartTag xmlContent xmlEndTag | xmlUnaryTag )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:190:5: xmlStartTag xmlContent xmlEndTag
                    {
                    pushFollow(FOLLOW_xmlStartTag_in_xmlObject1168);
                    xmlStartTag();

                    state._fsp--;


                    pushFollow(FOLLOW_xmlContent_in_xmlObject1170);
                    xmlContent();

                    state._fsp--;


                    pushFollow(FOLLOW_xmlEndTag_in_xmlObject1172);
                    xmlEndTag();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:191:17: xmlUnaryTag
                    {
                    pushFollow(FOLLOW_xmlUnaryTag_in_xmlObject1190);
                    xmlUnaryTag();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlObject"



    // $ANTLR start "xmlStartTag"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:194:1: xmlStartTag : '<' ID ( xmlAttributesOrPattern )* '>' ;
    public final void xmlStartTag() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:195:2: ( '<' ID ( xmlAttributesOrPattern )* '>' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:196:5: '<' ID ( xmlAttributesOrPattern )* '>'
            {
            match(input,30,FOLLOW_30_in_xmlStartTag1210); 

            match(input,ID,FOLLOW_ID_in_xmlStartTag1269); 

            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:198:5: ( xmlAttributesOrPattern )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID||LA13_0==39||LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:198:6: xmlAttributesOrPattern
            	    {
            	    pushFollow(FOLLOW_xmlAttributesOrPattern_in_xmlStartTag1326);
            	    xmlAttributesOrPattern();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,38,FOLLOW_38_in_xmlStartTag1335); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlStartTag"



    // $ANTLR start "xmlEndTag"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:202:1: xmlEndTag : '</' ID '>' ;
    public final void xmlEndTag() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:203:2: ( '</' ID '>' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:203:5: '</' ID '>'
            {
            match(input,31,FOLLOW_31_in_xmlEndTag1406); 

            match(input,ID,FOLLOW_ID_in_xmlEndTag1408); 

            match(input,38,FOLLOW_38_in_xmlEndTag1410); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlEndTag"



    // $ANTLR start "xmlContent"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:206:1: xmlContent : ( ( xmlObject )+ | xmlText );
    public final void xmlContent() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:207:2: ( ( xmlObject )+ | xmlText )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==ID||(LA15_0 >= 18 && LA15_0 <= 19)||LA15_0==31||LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:208:2: ( xmlObject )+
                    {
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:208:2: ( xmlObject )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==30) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:208:3: xmlObject
                    	    {
                    	    pushFollow(FOLLOW_xmlObject_in_xmlContent1429);
                    	    xmlObject();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:209:11: xmlText
                    {
                    pushFollow(FOLLOW_xmlText_in_xmlContent1443);
                    xmlText();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlContent"



    // $ANTLR start "xmlUnaryTag"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:211:1: xmlUnaryTag : '<' ID ( xmlAttributesOrPattern )? '/>' ;
    public final void xmlUnaryTag() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:2: ( '<' ID ( xmlAttributesOrPattern )? '/>' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:5: '<' ID ( xmlAttributesOrPattern )? '/>'
            {
            match(input,30,FOLLOW_30_in_xmlUnaryTag1457); 

            match(input,ID,FOLLOW_ID_in_xmlUnaryTag1459); 

            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:12: ( xmlAttributesOrPattern )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||LA16_0==39||LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:13: xmlAttributesOrPattern
                    {
                    pushFollow(FOLLOW_xmlAttributesOrPattern_in_xmlUnaryTag1462);
                    xmlAttributesOrPattern();

                    state._fsp--;


                    }
                    break;

            }


            match(input,28,FOLLOW_28_in_xmlUnaryTag1466); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlUnaryTag"



    // $ANTLR start "xmlAttributesOrPattern"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:216:1: xmlAttributesOrPattern : ( pattern | valueOf | ( xmlAttribute )+ );
    public final void xmlAttributesOrPattern() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:217:3: ( pattern | valueOf | ( xmlAttribute )+ )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt18=1;
                }
                break;
            case 43:
                {
                alt18=2;
                }
                break;
            case ID:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:218:4: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_xmlAttributesOrPattern1489);
                    pattern();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:219:18: valueOf
                    {
                    pushFollow(FOLLOW_valueOf_in_xmlAttributesOrPattern1508);
                    valueOf();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:220:18: ( xmlAttribute )+
                    {
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:220:18: ( xmlAttribute )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:220:19: xmlAttribute
                    	    {
                    	    pushFollow(FOLLOW_xmlAttribute_in_xmlAttributesOrPattern1528);
                    	    xmlAttribute();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlAttributesOrPattern"



    // $ANTLR start "xmlAttribute"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:224:1: xmlAttribute : ID '=' xmlAttributeValue ;
    public final void xmlAttribute() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:225:2: ( ID '=' xmlAttributeValue )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:226:5: ID '=' xmlAttributeValue
            {
            match(input,ID,FOLLOW_ID_in_xmlAttribute1566); 

            match(input,33,FOLLOW_33_in_xmlAttribute1627); 

            pushFollow(FOLLOW_xmlAttributeValue_in_xmlAttribute1634);
            xmlAttributeValue();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlAttribute"



    // $ANTLR start "xmlAttributeValue"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:231:1: xmlAttributeValue : STRING ;
    public final void xmlAttributeValue() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:232:2: ( STRING )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:233:5: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_xmlAttributeValue1692); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlAttributeValue"



    // $ANTLR start "xmlText"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:236:1: xmlText : ( xmlWord )* ;
    public final void xmlText() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:236:9: ( ( xmlWord )* )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:236:12: ( xmlWord )*
            {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:236:12: ( xmlWord )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ID||(LA19_0 >= 18 && LA19_0 <= 19)||LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:236:12: xmlWord
            	    {
            	    pushFollow(FOLLOW_xmlWord_in_xmlText1755);
            	    xmlWord();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlText"



    // $ANTLR start "xmlWord"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:239:1: xmlWord : ( ID | '=' | xmlCharName | xmlCharNumber );
    public final void xmlWord() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:239:9: ( ID | '=' | xmlCharName | xmlCharNumber )
            int alt20=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 19:
                {
                alt20=3;
                }
                break;
            case 18:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:239:10: ID
                    {
                    match(input,ID,FOLLOW_ID_in_xmlWord1768); 

                    }
                    break;
                case 2 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:240:12: '='
                    {
                    match(input,33,FOLLOW_33_in_xmlWord1781); 

                    }
                    break;
                case 3 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:241:12: xmlCharName
                    {
                    pushFollow(FOLLOW_xmlCharName_in_xmlWord1794);
                    xmlCharName();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:242:12: xmlCharNumber
                    {
                    pushFollow(FOLLOW_xmlCharNumber_in_xmlWord1807);
                    xmlCharNumber();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlWord"



    // $ANTLR start "xmlCharName"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:247:1: xmlCharName : '&' ID ';' ;
    public final void xmlCharName() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:248:2: ( '&' ID ';' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:249:5: '&' ID ';'
            {
            match(input,19,FOLLOW_19_in_xmlCharName1825); 

            match(input,ID,FOLLOW_ID_in_xmlCharName1827); 

            match(input,29,FOLLOW_29_in_xmlCharName1829); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlCharName"



    // $ANTLR start "xmlCharNumber"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:252:1: xmlCharNumber : '&#' INT ';' ;
    public final void xmlCharNumber() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:253:2: ( '&#' INT ';' )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:254:5: '&#' INT ';'
            {
            match(input,18,FOLLOW_18_in_xmlCharNumber1848); 

            match(input,INT,FOLLOW_INT_in_xmlCharNumber1850); 

            match(input,29,FOLLOW_29_in_xmlCharNumber1852); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "xmlCharNumber"



    // $ANTLR start "module"
    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:259:1: module : moduleDef ( importDef )* ( functionDefinition )* ;
    public final void module() throws RecognitionException {
        try {
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:260:2: ( moduleDef ( importDef )* ( functionDefinition )* )
            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:261:2: moduleDef ( importDef )* ( functionDefinition )*
            {
            pushFollow(FOLLOW_moduleDef_in_module1870);
            moduleDef();

            state._fsp--;


            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:262:2: ( importDef )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:262:3: importDef
            	    {
            	    pushFollow(FOLLOW_importDef_in_module1874);
            	    importDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:263:2: ( functionDefinition )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:263:3: functionDefinition
            	    {
            	    pushFollow(FOLLOW_functionDefinition_in_module1880);
            	    functionDefinition();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "module"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\15\uffff";
    static final String DFA12_eofS =
        "\15\uffff";
    static final String DFA12_minS =
        "\1\36\4\12\1\41\2\uffff\1\12\1\54\1\15\2\12";
    static final String DFA12_maxS =
        "\1\36\1\12\1\53\2\12\1\41\2\uffff\1\53\1\54\1\15\2\53";
    static final String DFA12_acceptS =
        "\6\uffff\1\1\1\2\5\uffff";
    static final String DFA12_specialS =
        "\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\1\5\21\uffff\1\7\11\uffff\1\6\1\3\3\uffff\1\4",
            "\1\10",
            "\1\11",
            "\1\12",
            "",
            "",
            "\1\6\21\uffff\1\7\11\uffff\2\6\3\uffff\1\6",
            "\1\13",
            "\1\14",
            "\1\6\21\uffff\1\7\11\uffff\2\6\3\uffff\1\6",
            "\1\5\21\uffff\1\7\11\uffff\2\6\3\uffff\1\6"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "189:1: xmlObject : ( xmlStartTag xmlContent xmlEndTag | xmlUnaryTag );";
        }
    }
 

    public static final BitSet FOLLOW_42_in_moduleDef559 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_moduleDef561 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_moduleDef563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_importDef573 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_importDef575 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_importDef577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionDefinition588 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_functionDefinition590 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_argList_in_functionDefinition592 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_functionDefinition594 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_functionDefinition596 = new BitSet(new long[]{0x0000108140020400L});
    public static final BitSet FOLLOW_statementList_in_functionDefinition599 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_functionDefinition602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList614 = new BitSet(new long[]{0x0000008140020402L});
    public static final BitSet FOLLOW_ID_in_statement629 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_33_in_statement632 = new BitSet(new long[]{0x0000008140020400L});
    public static final BitSet FOLLOW_expression_in_statement634 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_expression_in_statement643 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_statement646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlModifyingExpression_in_expression656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlPattern_in_expression661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlFragment_in_expression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionInvocation_in_expression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlDocument_in_expression704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionInvocation719 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_functionInvocation721 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_argList_in_functionInvocation723 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_functionInvocation725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_referenceOrBinding746 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_referenceOrBinding749 = new BitSet(new long[]{0x0000008140020400L});
    public static final BitSet FOLLOW_expression_in_referenceOrBinding751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpression_in_xmlModifyingExpression771 = new BitSet(new long[]{0x0000003C03810000L});
    public static final BitSet FOLLOW_replaceOperation_in_xmlModifyingExpression781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appendOperation_in_xmlModifyingExpression787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prependOperation_in_xmlModifyingExpression793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_matchOperation_in_xmlModifyingExpression799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveOperation_in_xmlModifyingExpression805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveFrontOperation_in_xmlModifyingExpression811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moveBackOperation_in_xmlModifyingExpression817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteOperation_in_xmlModifyingExpression823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_pathExpression837 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_path_in_pathExpression839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_path851 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_path854 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_path856 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_35_in_replaceOperation869 = new BitSet(new long[]{0x0000000040120400L});
    public static final BitSet FOLLOW_value_in_replaceOperation871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_value886 = new BitSet(new long[]{0x0000008140020400L});
    public static final BitSet FOLLOW_expression_in_value888 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_value890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpression_in_value895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlFragment_in_value903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_appendOperation915 = new BitSet(new long[]{0x0000000040120400L});
    public static final BitSet FOLLOW_value_in_appendOperation917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_prependOperation928 = new BitSet(new long[]{0x0000000040120400L});
    public static final BitSet FOLLOW_value_in_prependOperation930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_matchOperation941 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_xmlFragment_in_matchOperation943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_moveOperation954 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_pathExpression_in_moveOperation956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_moveFrontOperation967 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_pathExpression_in_moveFrontOperation969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_moveBackOperation980 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_pathExpression_in_moveBackOperation982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_deleteOperation993 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_deleteOperation995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableReference_in_binding1005 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_binding1007 = new BitSet(new long[]{0x0000008140020400L});
    public static final BitSet FOLLOW_expression_in_binding1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableReference1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableReference_in_argList1030 = new BitSet(new long[]{0x0000000200400002L});
    public static final BitSet FOLLOW_33_in_argList1033 = new BitSet(new long[]{0x0000008140020400L});
    public static final BitSet FOLLOW_expression_in_argList1035 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_argList1040 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_variableReference_in_argList1042 = new BitSet(new long[]{0x0000000200400002L});
    public static final BitSet FOLLOW_33_in_argList1045 = new BitSet(new long[]{0x0000008140020400L});
    public static final BitSet FOLLOW_expression_in_argList1047 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_39_in_pattern1063 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_pattern1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_xmlPattern1082 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_xmlFragment_in_xmlPattern1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_valueOf1099 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_valueOf1101 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_valueOf1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_xmlDocument1121 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlDocument1123 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_xmlAttribute_in_xmlDocument1125 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_xmlDocument1127 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_xmlObject_in_xmlDocument1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlObject_in_xmlFragment1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlStartTag_in_xmlObject1168 = new BitSet(new long[]{0x00000002400C0400L});
    public static final BitSet FOLLOW_xmlContent_in_xmlObject1170 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_xmlEndTag_in_xmlObject1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlUnaryTag_in_xmlObject1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_xmlStartTag1210 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlStartTag1269 = new BitSet(new long[]{0x000008C000000400L});
    public static final BitSet FOLLOW_xmlAttributesOrPattern_in_xmlStartTag1326 = new BitSet(new long[]{0x000008C000000400L});
    public static final BitSet FOLLOW_38_in_xmlStartTag1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_xmlEndTag1406 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlEndTag1408 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_xmlEndTag1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlObject_in_xmlContent1429 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_xmlText_in_xmlContent1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_xmlUnaryTag1457 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlUnaryTag1459 = new BitSet(new long[]{0x0000088010000400L});
    public static final BitSet FOLLOW_xmlAttributesOrPattern_in_xmlUnaryTag1462 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_xmlUnaryTag1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_xmlAttributesOrPattern1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueOf_in_xmlAttributesOrPattern1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_xmlAttributesOrPattern1528 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_xmlAttribute1566 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_xmlAttribute1627 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_xmlAttributeValue_in_xmlAttribute1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_xmlAttributeValue1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlWord_in_xmlText1755 = new BitSet(new long[]{0x00000002000C0402L});
    public static final BitSet FOLLOW_ID_in_xmlWord1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_xmlWord1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlCharName_in_xmlWord1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlCharNumber_in_xmlWord1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_xmlCharName1825 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlCharName1827 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_xmlCharName1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_xmlCharNumber1848 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_xmlCharNumber1850 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_xmlCharNumber1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDef_in_module1870 = new BitSet(new long[]{0x0000020000000402L});
    public static final BitSet FOLLOW_importDef_in_module1874 = new BitSet(new long[]{0x0000020000000402L});
    public static final BitSet FOLLOW_functionDefinition_in_module1880 = new BitSet(new long[]{0x0000000000000402L});

}