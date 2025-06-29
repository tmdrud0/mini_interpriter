package parser.state;

import scanner.automata.Token;

public interface TokenIdentifier {
    Boolean isRight(Token token);
}