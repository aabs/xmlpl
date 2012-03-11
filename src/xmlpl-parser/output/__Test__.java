import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        xmlplLexer lex = new xmlplLexer(new ANTLRFileStream("F:\\backup - fluorine\\20120306\\shared.datastore\\repository\\personal\\dev\\misc\\dev\\xmlpl\\src\\xmlpl-parser\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        xmlplParser g = new xmlplParser(tokens, 49100, null);
        try {
            g.module();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}