package parser.state;

import java.util.List;
import java.util.Queue;
import javafx.util.Pair;

import scanner.automata.Token;

public abstract class State {
    List<Pair<TokenIdentifier,Queue<State>>> transitions;
    Token rToken;
    Boolean isInitialized = false;
    protected State(){}
    
    private void initialize(){
        transitions = getTransitions();
        rToken = getRemoveToken();
        isInitialized = true;
    }
    public Boolean tlqk(Queue<Token> tokens){
        if(!isInitialized)  initialize();
        if(!removeToken(tokens))    return false;
        Boolean isMatched = false;

        for(Pair<TokenIdentifier,Queue<State>> pair : transitions)
        if(pair.getKey().isRight(tokens.peek())){
            isMatched = true;
            for(State state : pair.getValue())  {
                isMatched &= state.tlqk(tokens);
                if(!isMatched)  break;
            }
            break;
        }
        
        if(isMatched)   operation(tokens.peek());
        return isMatched;
    }
    
    private Boolean removeToken(Queue<Token> tokens){
        Boolean result = true;
        if(rToken==Token.NULL)  return result;

        result = rToken.isSameNum(tokens.peek());
        if(result)  tokens.remove();
        return result;
    }
    abstract protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions();
    abstract protected Token getRemoveToken();
    abstract protected void operation(Token token);
}