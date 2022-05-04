import org.antlr.v4.runtime.*;

import java.io.IOException;

public class main {

    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName(args[0]);
            cNombreInput claseNombreInput = new cNombreInput(args[0]);

            gramaticaLexer lexer = new gramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            gramaticaParser parser = new gramaticaParser(tokens,claseNombreInput);

            parser.removeErrorListeners();
            parser.setErrorHandler(new CustomErrorStrategy());
            parser.addErrorListener(new CustomErrorListener());

            parser.prg();


        } catch (org.antlr.v4.runtime.RecognitionException e) {
            //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}