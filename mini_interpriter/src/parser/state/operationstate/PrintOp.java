package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class PrintOp extends OperationState{
    static final State instance = new PrintOp();
    @Override
    protected void operation(Token token){
        machine.print();
    }
    public static State getInstance() {
        return instance;
    }
}