package parser.state;

import scanner.automata.Token;

public class AllIdentifier implements TokenIdentifier{
    static final TokenIdentifier instance = new AllIdentifier();
    
    @Override
    public Boolean isRight(Token token) {
        return true;
    }
    static public TokenIdentifier getInstance(){
        return instance;
    }
}