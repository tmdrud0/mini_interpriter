package parser.state.operationstate;

import parser.state.State;
import scanner.automata.Token;

public class PushValOp extends OperationState{
    static final State instance = new PushValOp();
    @Override
    protected void operation(Token token){
        if(token.gettNum()==3)   machine.pushId(token.gettId());
        else                     machine.pushVal(Integer.parseInt(token.gettString()));
    }
    public static State getInstance() {
        return instance;
    }
}