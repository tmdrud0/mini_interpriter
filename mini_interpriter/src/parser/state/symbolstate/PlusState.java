package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class PlusState extends SymbolState{
    static final State instance = new PlusState();
    @Override
    protected Token getRemoveToken() {
        return new Token(10);
    }
    public static State getInstance() {
        return instance;
    }
}