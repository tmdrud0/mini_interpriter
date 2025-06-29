package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class CaretState extends SymbolState{
    static final State instance = new CaretState();
    @Override
    protected Token getRemoveToken() {
        return new Token(25);
    }
    public static State getInstance() {
        return instance;
    }
}