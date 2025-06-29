package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class MultiState extends SymbolState{
    static final State instance = new MultiState();
    @Override
    protected Token getRemoveToken() {
        return new Token(12);
    }
    public static State getInstance() {
        return instance;
    }
} 