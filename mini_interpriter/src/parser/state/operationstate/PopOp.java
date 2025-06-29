package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class PopOp extends OperationState{
    static final State instance = new PopOp();
    @Override
    protected void operation(Token token){
        machine.pop();
    }
    public static State getInstance() {
        return instance;
    }
}