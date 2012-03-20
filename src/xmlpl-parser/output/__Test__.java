import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        mccarthymccarthyLexer lex = new mccarthymccarthyLexer(new ANTLRFileStream("C:\\dat\\repository\\personal\\dev\\projects\\loblang\\src\\xmlpl-parser\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        mccarthyParser g = new mccarthyParser(tokens, 49153, null);
        try {
            g.module();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}