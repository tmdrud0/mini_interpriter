package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class MulOp extends OperationState{
    static final State instance = new MulOp();
    @Override
    protected void operation(Token token){
        machine.mul();
    }
    public static State getInstance() {
        return instance;
    }
}