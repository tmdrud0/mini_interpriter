package parser.state.symbolstate;

import parser.state.State;
import scanner.automata.Token;

public class OpenState extends SymbolState{
    static final State instance = new OpenState();
    @Override
    protected Token getRemoveToken() {
        return new Token(34);
    }
    public static State getInstance() {
        return instance;
    }
}