package parser;

import java.util.*;
import javafx.util.Pair;

import parser.state.*;

public class PowerState extends BasicState{
    static final State instance = new PowerState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> toFactor;
        
        toFactor = new Pair<>(AllIdentifier.getInstance(), new LinkedList<>(
            Arrays.asList(FactorState.getInstance(),PPowerState.getInstance())));

        transitions.add(toFactor);
        return transitions;
    }
    public static State getInstance() {
        return instance;
    }
}