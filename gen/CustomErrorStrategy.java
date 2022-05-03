import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

public class CustomErrorStrategy extends DefaultErrorStrategy {

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        return super.recoverInline(recognizer);
    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        super.recover(recognizer, e);
    }

    @Override
    public void sync(Parser recognizer) throws RecognitionException {
        super.sync(recognizer);
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Falta " + expecting.toString(recognizer.getVocabulary()) + " antes de " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, null);
        }
    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "Se esperaba " + e.getExpectedTokens().toString(recognizer.getVocabulary()) + ", pero se encontró "+ this.getTokenErrorDisplay(e.getOffendingToken());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);

    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "Se esperaba " + expecting.toString(recognizer.getVocabulary()) + ", pero se encontró " + tokenName;
            recognizer.notifyErrorListeners(t, msg,null);
        }
    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == -1) {
                input = "<EOF>";
            } else {
                input = tokens.getText(e.getStartToken(), e.getOffendingToken());
            }
        } else {
            input = "<unknown input>";
        }

        String msg = "Se esperaba "+this.getExpectedTokens(recognizer).toString(recognizer.getVocabulary())+", pero se encontró " + this.escapeWSAndQuote(input);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

}
