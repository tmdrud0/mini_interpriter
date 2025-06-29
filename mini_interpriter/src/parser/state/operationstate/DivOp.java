package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class DivOp extends OperationState{
    static final State instance = new DivOp();
    @Override
    protected void operation(Token token){
        machine.div();
    }
    public static State getInstance() {
        return instance;
    }
}