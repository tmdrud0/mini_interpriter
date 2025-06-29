package parser;

import java.util.*;
import javafx.util.Pair;

import parser.state.*;

public class ExpresionState extends BasicState{
    static final State instance = new ExpresionState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> toTerm;
        
        toTerm = new Pair<>(AllIdentifier.getInstance(), new LinkedList<>(
            Arrays.asList(TermState.getInstance(),PExpresionState.getInstance())));

        transitions.add(toTerm);
        return transitions;
    }
    public static State getInstance() {
        return instance;
    }
}