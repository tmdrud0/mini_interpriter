package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class AssignOp extends OperationState{
    static final State instance = new AssignOp();
    @Override
    protected void operation(Token token){
        machine.assign();
    }
    public static State getInstance() {
        return instance;
    }
}