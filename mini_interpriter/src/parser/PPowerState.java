package parser;

import java.util.*;

import javafx.util.Pair;
import parser.state.*;
import parser.state.symbolstate.*;
import scanner.automata.Token;
import parser.state.operationstate.*;

public class PPowerState extends BasicState{
    static final State instance = new PPowerState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> caret;
        Pair<TokenIdentifier, Queue<State>> empty;
        
        caret = new Pair<>(new SameIdentifier(new Token(25)), new LinkedList<>(
            Arrays.asList(CaretState.getInstance(),PowerState.getInstance(),PowOp.getInstance())));
        empty = new Pair<>(AllIdentifier.getInstance(),new LinkedList<>(
            Arrays.asList(EmptyState.getInstance())));

        transitions.add(caret);
        transitions.add(empty);
        return transitions;
    }

    public static State getInstance() {
        return instance;
    }
}