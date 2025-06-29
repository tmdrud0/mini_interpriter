package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class AddOp extends OperationState{
    static final State instance = new AddOp();
    @Override
    protected void operation(Token token){
        machine.add();
    }
    public static State getInstance() {
        return instance;
    }
}