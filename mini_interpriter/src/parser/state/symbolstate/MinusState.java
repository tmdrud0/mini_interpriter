package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class MinusState extends SymbolState{
    static final State instance = new MinusState();
    @Override
    protected Token getRemoveToken() {
        return new Token(11);
    }
    public static State getInstance() {
        return instance;
    }
}