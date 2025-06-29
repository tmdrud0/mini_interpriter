package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class EqualState extends SymbolState{
    static final State instance = new EqualState();
    @Override
    protected Token getRemoveToken() {
        return new Token(15);
    }
    public static State getInstance() {
        return instance;
    }
}