package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class EmptyState extends SymbolState{
    static final State instance = new EmptyState();
    @Override
    protected Token getRemoveToken() {
        return Token.NULL;
    }
    public static State getInstance() {
        return instance;
    }
}