package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class SubOp extends OperationState{
    static final State instance = new SubOp();
    @Override
    protected void operation(Token token){
        machine.sub();
    }
    public static State getInstance() {
        return instance;
    }
}