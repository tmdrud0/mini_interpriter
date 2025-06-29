package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class PushIdOp extends OperationState{
    static final State instance = new PushIdOp();
    @Override
    protected void operation(Token token){
        machine.pushVal(token.gettId());
    }
    public static State getInstance() {
        return instance;
    }
}