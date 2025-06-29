package parser.state;

import scanner.automata.Token;

public class SameIdentifier implements TokenIdentifier{
    Token token;
    public SameIdentifier(Token token){
        this.token = token;
    }
    @Override
    public Boolean isRight(Token token) {
        return this.token.isSameNum(token);
    }
}