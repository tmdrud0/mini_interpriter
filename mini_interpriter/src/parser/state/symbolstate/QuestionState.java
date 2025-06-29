package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class QuestionState extends SymbolState{
    static final State instance = new QuestionState();
    @Override
    protected Token getRemoveToken() {
        return new Token(26);
    }
    public static State getInstance() {
        return instance;
    }
}