// $ANTLR 3.4 C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g 2012-03-05 22:29:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class xmlplParser extends DebugParser {
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


public static final String[] ruleNames = new String[] {
    "invalidRule", "referenceOrBinding", "xmlCharNumber", "xmlContent", 
    "importDef", "xmlStartTag", "statementList", "matchOperation", "xmlAttribute", 
    "variableReference", "appendOperation", "value", "xmlAttributesOrPattern", 
    "moveBackOperation", "xmlAttributeValue", "argList", "prependOperation", 
    "xmlModifyingExpression", "xmlUnaryTag", "pattern", "path", "xmlWord", 
    "valueOf", "replaceOperation", "moveFrontOperation", "pathExpression", 
    "statement", "functionInvocation", "binding", "xmlDocument", "xmlFragment", 
    "functionDefinition", "xmlText", "xmlObject", "xmlEndTag", "moveOperation", 
    "moduleDef", "module", "xmlCharName", "expression", "xmlPattern", "deleteOperation"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public xmlplParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public xmlplParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public xmlplParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return xmlplParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g"; }



    // $ANTLR start "moduleDef"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:60:1: moduleDef : 'module' ID '.' ;
    public final void moduleDef() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "moduleDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:61:2: ( 'module' ID '.' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:61:4: 'module' ID '.'
            {
            dbg.location(61,4);
            match(input,42,FOLLOW_42_in_moduleDef559); 
            dbg.location(61,13);
            match(input,ID,FOLLOW_ID_in_moduleDef561); 
            dbg.location(61,16);
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
        dbg.location(62, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moduleDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "moduleDef"



    // $ANTLR start "importDef"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:64:1: importDef : 'import' ID '.' ;
    public final void importDef() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "importDef");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:64:11: ( 'import' ID '.' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:64:13: 'import' ID '.'
            {
            dbg.location(64,13);
            match(input,41,FOLLOW_41_in_importDef573); 
            dbg.location(64,22);
            match(input,ID,FOLLOW_ID_in_importDef575); 
            dbg.location(64,25);
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
        dbg.location(65, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "importDef");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "importDef"



    // $ANTLR start "functionDefinition"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:67:1: functionDefinition : ID '(' argList ')' '{' statementList '}' ;
    public final void functionDefinition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "functionDefinition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:68:2: ( ID '(' argList ')' '{' statementList '}' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:68:4: ID '(' argList ')' '{' statementList '}'
            {
            dbg.location(68,4);
            match(input,ID,FOLLOW_ID_in_functionDefinition588); 
            dbg.location(68,7);
            match(input,20,FOLLOW_20_in_functionDefinition590); 
            dbg.location(68,11);
            pushFollow(FOLLOW_argList_in_functionDefinition592);
            argList();

            state._fsp--;

            dbg.location(68,19);
            match(input,21,FOLLOW_21_in_functionDefinition594); 
            dbg.location(68,23);
            match(input,43,FOLLOW_43_in_functionDefinition596); 
            dbg.location(69,2);
            pushFollow(FOLLOW_statementList_in_functionDefinition599);
            statementList();

            state._fsp--;

            dbg.location(70,2);
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
        dbg.location(71, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionDefinition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "functionDefinition"



    // $ANTLR start "statementList"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:73:1: statementList : ( statement )* ;
    public final void statementList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statementList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:2: ( ( statement )* )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:4: ( statement )*
            {
            dbg.location(74,4);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:4: ( statement )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==17||LA1_0==30||LA1_0==32||LA1_0==39) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:74:5: statement
            	    {
            	    dbg.location(74,5);
            	    pushFollow(FOLLOW_statement_in_statementList614);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(75, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statementList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statementList"



    // $ANTLR start "statement"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:77:1: statement : ( ID ( '=' expression )? | expression ) ';' ;
    public final void statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:2: ( ( ID ( '=' expression )? | expression ) ';' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:4: ( ID ( '=' expression )? | expression ) ';'
            {
            dbg.location(78,4);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:4: ( ID ( '=' expression )? | expression )
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

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

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA3_0==17||LA3_0==30||LA3_0==32||LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:6: ID ( '=' expression )?
                    {
                    dbg.location(78,6);
                    match(input,ID,FOLLOW_ID_in_statement629); 
                    dbg.location(78,9);
                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:9: ( '=' expression )?
                    int alt2=2;
                    try { dbg.enterSubRule(2);
                    try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==33) ) {
                        alt2=1;
                    }
                    } finally {dbg.exitDecision(2);}

                    switch (alt2) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:78:10: '=' expression
                            {
                            dbg.location(78,10);
                            match(input,33,FOLLOW_33_in_statement632); 
                            dbg.location(78,14);
                            pushFollow(FOLLOW_expression_in_statement634);
                            expression();

                            state._fsp--;


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:79:5: expression
                    {
                    dbg.location(79,5);
                    pushFollow(FOLLOW_expression_in_statement643);
                    expression();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(79,17);
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
        dbg.location(80, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "expression"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:81:1: expression : ( xmlModifyingExpression | xmlPattern | xmlFragment | functionInvocation | xmlDocument );
    public final void expression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:82:2: ( xmlModifyingExpression | xmlPattern | xmlFragment | functionInvocation | xmlDocument )
            int alt4=5;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:82:4: xmlModifyingExpression
                    {
                    dbg.location(82,4);
                    pushFollow(FOLLOW_xmlModifyingExpression_in_expression656);
                    xmlModifyingExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:83:4: xmlPattern
                    {
                    dbg.location(83,4);
                    pushFollow(FOLLOW_xmlPattern_in_expression661);
                    xmlPattern();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:84:4: xmlFragment
                    {
                    dbg.location(84,4);
                    pushFollow(FOLLOW_xmlFragment_in_expression694);
                    xmlFragment();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:85:4: functionInvocation
                    {
                    dbg.location(85,4);
                    pushFollow(FOLLOW_functionInvocation_in_expression699);
                    functionInvocation();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:86:4: xmlDocument
                    {
                    dbg.location(86,4);
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
        dbg.location(87, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "functionInvocation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:89:1: functionInvocation : ID '(' argList ')' ;
    public final void functionInvocation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "functionInvocation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:89:20: ( ID '(' argList ')' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:90:5: ID '(' argList ')'
            {
            dbg.location(90,5);
            match(input,ID,FOLLOW_ID_in_functionInvocation719); 
            dbg.location(90,8);
            match(input,20,FOLLOW_20_in_functionInvocation721); 
            dbg.location(90,12);
            pushFollow(FOLLOW_argList_in_functionInvocation723);
            argList();

            state._fsp--;

            dbg.location(90,20);
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
        dbg.location(91, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionInvocation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "functionInvocation"



    // $ANTLR start "referenceOrBinding"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:93:1: referenceOrBinding : ID ( '=' expression )? ;
    public final void referenceOrBinding() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "referenceOrBinding");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:94:2: ( ID ( '=' expression )? )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:95:5: ID ( '=' expression )?
            {
            dbg.location(95,5);
            match(input,ID,FOLLOW_ID_in_referenceOrBinding746); 
            dbg.location(95,8);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:95:8: ( '=' expression )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:95:9: '=' expression
                    {
                    dbg.location(95,9);
                    match(input,33,FOLLOW_33_in_referenceOrBinding749); 
                    dbg.location(95,13);
                    pushFollow(FOLLOW_expression_in_referenceOrBinding751);
                    expression();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(96, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "referenceOrBinding");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "referenceOrBinding"



    // $ANTLR start "xmlModifyingExpression"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:98:1: xmlModifyingExpression : pathExpression ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation ) ;
    public final void xmlModifyingExpression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlModifyingExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:99:2: ( pathExpression ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation ) )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:99:4: pathExpression ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation )
            {
            dbg.location(99,4);
            pushFollow(FOLLOW_pathExpression_in_xmlModifyingExpression771);
            pathExpression();

            state._fsp--;

            dbg.location(100,2);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:100:2: ( replaceOperation | appendOperation | prependOperation | matchOperation | moveOperation | moveFrontOperation | moveBackOperation | deleteOperation )
            int alt6=8;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:101:5: replaceOperation
                    {
                    dbg.location(101,5);
                    pushFollow(FOLLOW_replaceOperation_in_xmlModifyingExpression781);
                    replaceOperation();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:102:5: appendOperation
                    {
                    dbg.location(102,5);
                    pushFollow(FOLLOW_appendOperation_in_xmlModifyingExpression787);
                    appendOperation();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:103:5: prependOperation
                    {
                    dbg.location(103,5);
                    pushFollow(FOLLOW_prependOperation_in_xmlModifyingExpression793);
                    prependOperation();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:104:5: matchOperation
                    {
                    dbg.location(104,5);
                    pushFollow(FOLLOW_matchOperation_in_xmlModifyingExpression799);
                    matchOperation();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:105:5: moveOperation
                    {
                    dbg.location(105,5);
                    pushFollow(FOLLOW_moveOperation_in_xmlModifyingExpression805);
                    moveOperation();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:106:5: moveFrontOperation
                    {
                    dbg.location(106,5);
                    pushFollow(FOLLOW_moveFrontOperation_in_xmlModifyingExpression811);
                    moveFrontOperation();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:107:5: moveBackOperation
                    {
                    dbg.location(107,5);
                    pushFollow(FOLLOW_moveBackOperation_in_xmlModifyingExpression817);
                    moveBackOperation();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:108:5: deleteOperation
                    {
                    dbg.location(108,5);
                    pushFollow(FOLLOW_deleteOperation_in_xmlModifyingExpression823);
                    deleteOperation();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(110, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlModifyingExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlModifyingExpression"



    // $ANTLR start "pathExpression"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:112:1: pathExpression : '$' path ;
    public final void pathExpression() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "pathExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:113:2: ( '$' path )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:113:4: '$' path
            {
            dbg.location(113,4);
            match(input,17,FOLLOW_17_in_pathExpression837); 
            dbg.location(113,8);
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
        dbg.location(114, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pathExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pathExpression"



    // $ANTLR start "path"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:1: path : ID ( '/' ID )* ;
    public final void path() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "path");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:6: ( ID ( '/' ID )* )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:8: ID ( '/' ID )*
            {
            dbg.location(116,8);
            match(input,ID,FOLLOW_ID_in_path851); 
            dbg.location(116,11);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:11: ( '/' ID )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:116:12: '/' ID
            	    {
            	    dbg.location(116,12);
            	    match(input,27,FOLLOW_27_in_path854); 
            	    dbg.location(116,16);
            	    match(input,ID,FOLLOW_ID_in_path856); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(117, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "path");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "path"



    // $ANTLR start "replaceOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:119:1: replaceOperation : '==' value ;
    public final void replaceOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "replaceOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:120:2: ( '==' value )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:120:4: '==' value
            {
            dbg.location(120,4);
            match(input,35,FOLLOW_35_in_replaceOperation869); 
            dbg.location(120,9);
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
        dbg.location(121, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "replaceOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "replaceOperation"



    // $ANTLR start "value"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:123:1: value : ( ID | '(' expression ')' | pathExpression | xmlFragment );
    public final void value() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:123:7: ( ID | '(' expression ')' | pathExpression | xmlFragment )
            int alt8=4;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:123:9: ID
                    {
                    dbg.location(123,9);
                    match(input,ID,FOLLOW_ID_in_value881); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:124:4: '(' expression ')'
                    {
                    dbg.location(124,4);
                    match(input,20,FOLLOW_20_in_value886); 
                    dbg.location(124,8);
                    pushFollow(FOLLOW_expression_in_value888);
                    expression();

                    state._fsp--;

                    dbg.location(124,19);
                    match(input,21,FOLLOW_21_in_value890); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:125:4: pathExpression
                    {
                    dbg.location(125,4);
                    pushFollow(FOLLOW_pathExpression_in_value895);
                    pathExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:126:7: xmlFragment
                    {
                    dbg.location(126,7);
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
        dbg.location(127, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "appendOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:129:1: appendOperation : '=>' value ;
    public final void appendOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "appendOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:130:2: ( '=>' value )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:130:5: '=>' value
            {
            dbg.location(130,5);
            match(input,36,FOLLOW_36_in_appendOperation915); 
            dbg.location(130,10);
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
        dbg.location(131, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "appendOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "appendOperation"



    // $ANTLR start "prependOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:133:1: prependOperation : '=<' value ;
    public final void prependOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prependOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:134:2: ( '=<' value )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:134:4: '=<' value
            {
            dbg.location(134,4);
            match(input,34,FOLLOW_34_in_prependOperation928); 
            dbg.location(134,9);
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
        dbg.location(135, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prependOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prependOperation"



    // $ANTLR start "matchOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:137:1: matchOperation : '=?' xmlFragment ;
    public final void matchOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "matchOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:138:2: ( '=?' xmlFragment )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:138:4: '=?' xmlFragment
            {
            dbg.location(138,4);
            match(input,37,FOLLOW_37_in_matchOperation941); 
            dbg.location(138,9);
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
        dbg.location(139, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "matchOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "matchOperation"



    // $ANTLR start "moveOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:141:1: moveOperation : '->' pathExpression ;
    public final void moveOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "moveOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:142:2: ( '->' pathExpression )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:142:4: '->' pathExpression
            {
            dbg.location(142,4);
            match(input,23,FOLLOW_23_in_moveOperation954); 
            dbg.location(142,9);
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
        dbg.location(143, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moveOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "moveOperation"



    // $ANTLR start "moveFrontOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:145:1: moveFrontOperation : '-><' pathExpression ;
    public final void moveFrontOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "moveFrontOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:146:2: ( '-><' pathExpression )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:146:4: '-><' pathExpression
            {
            dbg.location(146,4);
            match(input,24,FOLLOW_24_in_moveFrontOperation967); 
            dbg.location(146,10);
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
        dbg.location(147, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moveFrontOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "moveFrontOperation"



    // $ANTLR start "moveBackOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:149:1: moveBackOperation : '->>' pathExpression ;
    public final void moveBackOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "moveBackOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:150:2: ( '->>' pathExpression )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:150:4: '->>' pathExpression
            {
            dbg.location(150,4);
            match(input,25,FOLLOW_25_in_moveBackOperation980); 
            dbg.location(150,10);
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
        dbg.location(151, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "moveBackOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "moveBackOperation"



    // $ANTLR start "deleteOperation"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:153:1: deleteOperation : '!=' ID ;
    public final void deleteOperation() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "deleteOperation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:154:2: ( '!=' ID )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:154:4: '!=' ID
            {
            dbg.location(154,4);
            match(input,16,FOLLOW_16_in_deleteOperation993); 
            dbg.location(154,9);
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
        dbg.location(155, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deleteOperation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "deleteOperation"



    // $ANTLR start "binding"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:157:1: binding : variableReference '=' expression ;
    public final void binding() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "binding");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:157:9: ( variableReference '=' expression )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:157:11: variableReference '=' expression
            {
            dbg.location(157,11);
            pushFollow(FOLLOW_variableReference_in_binding1005);
            variableReference();

            state._fsp--;

            dbg.location(157,29);
            match(input,33,FOLLOW_33_in_binding1007); 
            dbg.location(157,33);
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
        dbg.location(158, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "binding");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "binding"



    // $ANTLR start "variableReference"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:160:1: variableReference : ID ;
    public final void variableReference() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "variableReference");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:161:2: ( ID )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:161:4: ID
            {
            dbg.location(161,4);
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
        dbg.location(162, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variableReference");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "variableReference"



    // $ANTLR start "argList"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:1: argList : expression ( ',' expression )* ;
    public final void argList() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:9: ( expression ( ',' expression )* )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:11: expression ( ',' expression )*
            {
            dbg.location(164,11);
            pushFollow(FOLLOW_expression_in_argList1030);
            expression();

            state._fsp--;

            dbg.location(164,22);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:22: ( ',' expression )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:164:23: ',' expression
            	    {
            	    dbg.location(164,23);
            	    match(input,22,FOLLOW_22_in_argList1033); 
            	    dbg.location(164,27);
            	    pushFollow(FOLLOW_expression_in_argList1035);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(165, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "argList"



    // $ANTLR start "pattern"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:167:1: pattern : '?' ID ;
    public final void pattern() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "pattern");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:167:9: ( '?' ID )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:167:11: '?' ID
            {
            dbg.location(167,11);
            match(input,39,FOLLOW_39_in_pattern1049); 
            dbg.location(167,15);
            match(input,ID,FOLLOW_ID_in_pattern1051); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(168, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pattern");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pattern"



    // $ANTLR start "xmlPattern"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:171:1: xmlPattern : '?' xmlFragment ;
    public final void xmlPattern() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlPattern");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:172:2: ( '?' xmlFragment )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:172:5: '?' xmlFragment
            {
            dbg.location(172,5);
            match(input,39,FOLLOW_39_in_xmlPattern1068); 
            dbg.location(172,9);
            pushFollow(FOLLOW_xmlFragment_in_xmlPattern1070);
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
        dbg.location(173, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlPattern");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlPattern"



    // $ANTLR start "valueOf"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:174:1: valueOf : '{' ID '}' ;
    public final void valueOf() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "valueOf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(174, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:174:9: ( '{' ID '}' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:175:3: '{' ID '}'
            {
            dbg.location(175,3);
            match(input,43,FOLLOW_43_in_valueOf1085); 
            dbg.location(175,7);
            match(input,ID,FOLLOW_ID_in_valueOf1087); 
            dbg.location(175,10);
            match(input,44,FOLLOW_44_in_valueOf1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(176, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "valueOf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "valueOf"



    // $ANTLR start "xmlDocument"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:179:1: xmlDocument : '<?' ID xmlAttribute '?>' xmlObject ;
    public final void xmlDocument() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlDocument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:180:2: ( '<?' ID xmlAttribute '?>' xmlObject )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:180:5: '<?' ID xmlAttribute '?>' xmlObject
            {
            dbg.location(180,5);
            match(input,32,FOLLOW_32_in_xmlDocument1107); 
            dbg.location(180,10);
            match(input,ID,FOLLOW_ID_in_xmlDocument1109); 
            dbg.location(180,13);
            pushFollow(FOLLOW_xmlAttribute_in_xmlDocument1111);
            xmlAttribute();

            state._fsp--;

            dbg.location(180,26);
            match(input,40,FOLLOW_40_in_xmlDocument1113); 
            dbg.location(180,31);
            pushFollow(FOLLOW_xmlObject_in_xmlDocument1115);
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
        dbg.location(181, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlDocument");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlDocument"



    // $ANTLR start "xmlFragment"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:184:1: xmlFragment : xmlObject ;
    public final void xmlFragment() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlFragment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:185:2: ( xmlObject )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:185:6: xmlObject
            {
            dbg.location(185,6);
            pushFollow(FOLLOW_xmlObject_in_xmlFragment1134);
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
        dbg.location(186, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlFragment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlFragment"



    // $ANTLR start "xmlObject"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:189:1: xmlObject : ( xmlStartTag xmlContent xmlEndTag | xmlUnaryTag );
    public final void xmlObject() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlObject");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:190:2: ( xmlStartTag xmlContent xmlEndTag | xmlUnaryTag )
            int alt10=2;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            try {
                isCyclicDecision = true;
                alt10 = dfa10.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:190:5: xmlStartTag xmlContent xmlEndTag
                    {
                    dbg.location(190,5);
                    pushFollow(FOLLOW_xmlStartTag_in_xmlObject1154);
                    xmlStartTag();

                    state._fsp--;

                    dbg.location(190,17);
                    pushFollow(FOLLOW_xmlContent_in_xmlObject1156);
                    xmlContent();

                    state._fsp--;

                    dbg.location(190,28);
                    pushFollow(FOLLOW_xmlEndTag_in_xmlObject1158);
                    xmlEndTag();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:191:17: xmlUnaryTag
                    {
                    dbg.location(191,17);
                    pushFollow(FOLLOW_xmlUnaryTag_in_xmlObject1176);
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
        dbg.location(192, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlObject");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlObject"



    // $ANTLR start "xmlStartTag"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:194:1: xmlStartTag : '<' ID ( xmlAttributesOrPattern )* '>' ;
    public final void xmlStartTag() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlStartTag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:195:2: ( '<' ID ( xmlAttributesOrPattern )* '>' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:196:5: '<' ID ( xmlAttributesOrPattern )* '>'
            {
            dbg.location(196,5);
            match(input,30,FOLLOW_30_in_xmlStartTag1196); 
            dbg.location(197,5);
            match(input,ID,FOLLOW_ID_in_xmlStartTag1255); 
            dbg.location(198,5);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:198:5: ( xmlAttributesOrPattern )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID||LA11_0==39||LA11_0==43) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:198:6: xmlAttributesOrPattern
            	    {
            	    dbg.location(198,6);
            	    pushFollow(FOLLOW_xmlAttributesOrPattern_in_xmlStartTag1312);
            	    xmlAttributesOrPattern();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}

            dbg.location(199,5);
            match(input,38,FOLLOW_38_in_xmlStartTag1321); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(200, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlStartTag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlStartTag"



    // $ANTLR start "xmlEndTag"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:202:1: xmlEndTag : '</' ID '>' ;
    public final void xmlEndTag() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlEndTag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:203:2: ( '</' ID '>' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:203:5: '</' ID '>'
            {
            dbg.location(203,5);
            match(input,31,FOLLOW_31_in_xmlEndTag1392); 
            dbg.location(203,10);
            match(input,ID,FOLLOW_ID_in_xmlEndTag1394); 
            dbg.location(203,13);
            match(input,38,FOLLOW_38_in_xmlEndTag1396); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(204, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlEndTag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlEndTag"



    // $ANTLR start "xmlContent"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:206:1: xmlContent : ( ( xmlObject )+ | xmlText );
    public final void xmlContent() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlContent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:207:2: ( ( xmlObject )+ | xmlText )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==ID||(LA13_0 >= 18 && LA13_0 <= 19)||LA13_0==31||LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:208:2: ( xmlObject )+
                    {
                    dbg.location(208,2);
                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:208:2: ( xmlObject )+
                    int cnt12=0;
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==30) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:208:3: xmlObject
                    	    {
                    	    dbg.location(208,3);
                    	    pushFollow(FOLLOW_xmlObject_in_xmlContent1415);
                    	    xmlObject();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt12++;
                    } while (true);
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:209:11: xmlText
                    {
                    dbg.location(209,11);
                    pushFollow(FOLLOW_xmlText_in_xmlContent1429);
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
        dbg.location(210, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlContent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlContent"



    // $ANTLR start "xmlUnaryTag"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:211:1: xmlUnaryTag : '<' ID ( xmlAttributesOrPattern )? '/>' ;
    public final void xmlUnaryTag() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlUnaryTag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:2: ( '<' ID ( xmlAttributesOrPattern )? '/>' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:5: '<' ID ( xmlAttributesOrPattern )? '/>'
            {
            dbg.location(212,5);
            match(input,30,FOLLOW_30_in_xmlUnaryTag1443); 
            dbg.location(212,9);
            match(input,ID,FOLLOW_ID_in_xmlUnaryTag1445); 
            dbg.location(212,12);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:12: ( xmlAttributesOrPattern )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID||LA14_0==39||LA14_0==43) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:212:13: xmlAttributesOrPattern
                    {
                    dbg.location(212,13);
                    pushFollow(FOLLOW_xmlAttributesOrPattern_in_xmlUnaryTag1448);
                    xmlAttributesOrPattern();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(212,38);
            match(input,28,FOLLOW_28_in_xmlUnaryTag1452); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(213, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlUnaryTag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlUnaryTag"



    // $ANTLR start "xmlAttributesOrPattern"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:216:1: xmlAttributesOrPattern : ( pattern | valueOf | ( xmlAttribute )+ );
    public final void xmlAttributesOrPattern() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlAttributesOrPattern");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(216, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:217:2: ( pattern | valueOf | ( xmlAttribute )+ )
            int alt16=3;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            switch ( input.LA(1) ) {
            case 39:
                {
                alt16=1;
                }
                break;
            case 43:
                {
                alt16=2;
                }
                break;
            case ID:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:217:6: pattern
                    {
                    dbg.location(217,6);
                    pushFollow(FOLLOW_pattern_in_xmlAttributesOrPattern1470);
                    pattern();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:218:18: valueOf
                    {
                    dbg.location(218,18);
                    pushFollow(FOLLOW_valueOf_in_xmlAttributesOrPattern1489);
                    valueOf();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:219:18: ( xmlAttribute )+
                    {
                    dbg.location(219,18);
                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:219:18: ( xmlAttribute )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:219:19: xmlAttribute
                    	    {
                    	    dbg.location(219,19);
                    	    pushFollow(FOLLOW_xmlAttribute_in_xmlAttributesOrPattern1509);
                    	    xmlAttribute();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt15++;
                    } while (true);
                    } finally {dbg.exitSubRule(15);}


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
        dbg.location(220, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlAttributesOrPattern");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlAttributesOrPattern"



    // $ANTLR start "xmlAttribute"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:223:1: xmlAttribute : ID '=' xmlAttributeValue ;
    public final void xmlAttribute() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlAttribute");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:224:2: ( ID '=' xmlAttributeValue )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:225:5: ID '=' xmlAttributeValue
            {
            dbg.location(225,5);
            match(input,ID,FOLLOW_ID_in_xmlAttribute1547); 
            dbg.location(226,9);
            match(input,33,FOLLOW_33_in_xmlAttribute1608); 
            dbg.location(227,5);
            pushFollow(FOLLOW_xmlAttributeValue_in_xmlAttribute1615);
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
        dbg.location(228, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlAttribute");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlAttribute"



    // $ANTLR start "xmlAttributeValue"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:230:1: xmlAttributeValue : STRING ;
    public final void xmlAttributeValue() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlAttributeValue");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(230, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:231:2: ( STRING )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:232:5: STRING
            {
            dbg.location(232,5);
            match(input,STRING,FOLLOW_STRING_in_xmlAttributeValue1673); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(233, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlAttributeValue");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlAttributeValue"



    // $ANTLR start "xmlText"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:235:1: xmlText : ( xmlWord )* ;
    public final void xmlText() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlText");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(235, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:235:9: ( ( xmlWord )* )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:235:12: ( xmlWord )*
            {
            dbg.location(235,12);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:235:12: ( xmlWord )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID||(LA17_0 >= 18 && LA17_0 <= 19)||LA17_0==33) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:235:12: xmlWord
            	    {
            	    dbg.location(235,12);
            	    pushFollow(FOLLOW_xmlWord_in_xmlText1736);
            	    xmlWord();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(236, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlText");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlText"



    // $ANTLR start "xmlWord"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:238:1: xmlWord : ( ID | '=' | xmlCharName | xmlCharNumber );
    public final void xmlWord() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlWord");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:238:9: ( ID | '=' | xmlCharName | xmlCharNumber )
            int alt18=4;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt18=1;
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            case 19:
                {
                alt18=3;
                }
                break;
            case 18:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:238:10: ID
                    {
                    dbg.location(238,10);
                    match(input,ID,FOLLOW_ID_in_xmlWord1749); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:239:12: '='
                    {
                    dbg.location(239,12);
                    match(input,33,FOLLOW_33_in_xmlWord1762); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:240:12: xmlCharName
                    {
                    dbg.location(240,12);
                    pushFollow(FOLLOW_xmlCharName_in_xmlWord1775);
                    xmlCharName();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:241:12: xmlCharNumber
                    {
                    dbg.location(241,12);
                    pushFollow(FOLLOW_xmlCharNumber_in_xmlWord1788);
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
        dbg.location(242, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlWord");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlWord"



    // $ANTLR start "xmlCharName"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:246:1: xmlCharName : '&' ID ';' ;
    public final void xmlCharName() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlCharName");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:247:2: ( '&' ID ';' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:248:5: '&' ID ';'
            {
            dbg.location(248,5);
            match(input,19,FOLLOW_19_in_xmlCharName1806); 
            dbg.location(248,9);
            match(input,ID,FOLLOW_ID_in_xmlCharName1808); 
            dbg.location(248,12);
            match(input,29,FOLLOW_29_in_xmlCharName1810); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(249, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlCharName");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlCharName"



    // $ANTLR start "xmlCharNumber"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:251:1: xmlCharNumber : '&#' INT ';' ;
    public final void xmlCharNumber() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "xmlCharNumber");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(251, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:252:2: ( '&#' INT ';' )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:253:5: '&#' INT ';'
            {
            dbg.location(253,5);
            match(input,18,FOLLOW_18_in_xmlCharNumber1829); 
            dbg.location(253,10);
            match(input,INT,FOLLOW_INT_in_xmlCharNumber1831); 
            dbg.location(253,14);
            match(input,29,FOLLOW_29_in_xmlCharNumber1833); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(254, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "xmlCharNumber");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "xmlCharNumber"



    // $ANTLR start "module"
    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:258:1: module : moduleDef ( importDef )* ( functionDefinition )* ;
    public final void module() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "module");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(258, 0);

        try {
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:259:2: ( moduleDef ( importDef )* ( functionDefinition )* )
            dbg.enterAlt(1);

            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:260:2: moduleDef ( importDef )* ( functionDefinition )*
            {
            dbg.location(260,2);
            pushFollow(FOLLOW_moduleDef_in_module1851);
            moduleDef();

            state._fsp--;

            dbg.location(261,2);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:261:2: ( importDef )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:261:3: importDef
            	    {
            	    dbg.location(261,3);
            	    pushFollow(FOLLOW_importDef_in_module1855);
            	    importDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}

            dbg.location(262,2);
            // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:262:2: ( functionDefinition )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==ID) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\aabs\\dev\\xmlpl\\src\\xmlpl-parser\\xmlpl.g:262:3: functionDefinition
            	    {
            	    dbg.location(262,3);
            	    pushFollow(FOLLOW_functionDefinition_in_module1861);
            	    functionDefinition();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(263, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "module");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "module"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\15\uffff";
    static final String DFA10_minS =
        "\1\36\4\12\1\41\2\uffff\1\12\1\54\1\15\2\12";
    static final String DFA10_maxS =
        "\1\36\1\12\1\53\2\12\1\41\2\uffff\1\53\1\54\1\15\2\53";
    static final String DFA10_acceptS =
        "\6\uffff\1\1\1\2\5\uffff";
    static final String DFA10_specialS =
        "\15\uffff}>";
    static final String[] DFA10_transitionS = {
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "189:1: xmlObject : ( xmlStartTag xmlContent xmlEndTag | xmlUnaryTag );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_42_in_moduleDef559 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_moduleDef561 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_moduleDef563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_importDef573 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_importDef575 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_importDef577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionDefinition588 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_functionDefinition590 = new BitSet(new long[]{0x0000008140020400L});
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
    public static final BitSet FOLLOW_20_in_functionInvocation721 = new BitSet(new long[]{0x0000008140020400L});
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
    public static final BitSet FOLLOW_expression_in_argList1030 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_argList1033 = new BitSet(new long[]{0x0000008140020400L});
    public static final BitSet FOLLOW_expression_in_argList1035 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_39_in_pattern1049 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_pattern1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_xmlPattern1068 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_xmlFragment_in_xmlPattern1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_valueOf1085 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_valueOf1087 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_valueOf1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_xmlDocument1107 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlDocument1109 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_xmlAttribute_in_xmlDocument1111 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_xmlDocument1113 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_xmlObject_in_xmlDocument1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlObject_in_xmlFragment1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlStartTag_in_xmlObject1154 = new BitSet(new long[]{0x00000002400C0400L});
    public static final BitSet FOLLOW_xmlContent_in_xmlObject1156 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_xmlEndTag_in_xmlObject1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlUnaryTag_in_xmlObject1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_xmlStartTag1196 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlStartTag1255 = new BitSet(new long[]{0x000008C000000400L});
    public static final BitSet FOLLOW_xmlAttributesOrPattern_in_xmlStartTag1312 = new BitSet(new long[]{0x000008C000000400L});
    public static final BitSet FOLLOW_38_in_xmlStartTag1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_xmlEndTag1392 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlEndTag1394 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_xmlEndTag1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlObject_in_xmlContent1415 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_xmlText_in_xmlContent1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_xmlUnaryTag1443 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlUnaryTag1445 = new BitSet(new long[]{0x0000088010000400L});
    public static final BitSet FOLLOW_xmlAttributesOrPattern_in_xmlUnaryTag1448 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_xmlUnaryTag1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_xmlAttributesOrPattern1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueOf_in_xmlAttributesOrPattern1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlAttribute_in_xmlAttributesOrPattern1509 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_xmlAttribute1547 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_xmlAttribute1608 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_xmlAttributeValue_in_xmlAttribute1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_xmlAttributeValue1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlWord_in_xmlText1736 = new BitSet(new long[]{0x00000002000C0402L});
    public static final BitSet FOLLOW_ID_in_xmlWord1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_xmlWord1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlCharName_in_xmlWord1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlCharNumber_in_xmlWord1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_xmlCharName1806 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_xmlCharName1808 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_xmlCharName1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_xmlCharNumber1829 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_xmlCharNumber1831 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_xmlCharNumber1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDef_in_module1851 = new BitSet(new long[]{0x0000020000000402L});
    public static final BitSet FOLLOW_importDef_in_module1855 = new BitSet(new long[]{0x0000020000000402L});
    public static final BitSet FOLLOW_functionDefinition_in_module1861 = new BitSet(new long[]{0x0000000000000402L});

}