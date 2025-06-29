package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class PowOp extends OperationState{
    static final State instance = new PowOp();
    @Override
    protected void operation(Token token){
        machine.pow();
    }
    public static State getInstance() {
        return instance;
    }
}