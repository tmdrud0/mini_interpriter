package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class ConstantState extends SymbolState{
    static final State instance = new ConstantState();
    @Override
    protected Token getRemoveToken() {
        return new Token(5);
    }
    public static State getInstance() {
        return instance;
    }
}