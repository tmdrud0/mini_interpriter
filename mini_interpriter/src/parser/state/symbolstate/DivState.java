package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class DivState extends SymbolState{
    static final State instance = new DivState();
    @Override
    protected Token getRemoveToken() {
        return new Token(13);
    }
    public static State getInstance() {
        return instance;
    }
}