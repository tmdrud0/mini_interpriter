package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class CloseState extends SymbolState{
    static final State instance = new CloseState();
    @Override
    protected Token getRemoveToken() {
        return new Token(35);
    }
    public static State getInstance() {
        return instance;
    }
}