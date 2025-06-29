package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class IdState extends SymbolState{
    static final State instance = new IdState();
    @Override
    protected Token getRemoveToken() {
        return new Token(3);
    }
    public static State getInstance() {
        return instance;
    }
}