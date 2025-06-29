package parser.state;

import scanner.automata.Token;

public abstract class BasicState extends State{
    @Override
    protected Token getRemoveToken() {
        return Token.NULL;
    }
    @Override
    protected void operation(Token token) {}
}