package parser;

import java.util.*;

import javafx.util.Pair;
import parser.state.*;
import parser.state.symbolstate.*;
import parser.state.operationstate.*;
import scanner.automata.Token;

public class PrintState extends BasicState{
    static final State instance = new PrintState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> print;

        print = new Pair<>(new SameIdentifier(new Token(26)), new LinkedList<>(
            Arrays.asList(QuestionState.getInstance(),ExpresionState.getInstance(),PrintOp.getInstance())));

        transitions.add(print);
        return transitions;
    }
    public static State getInstance() {
        return instance;
    }
}