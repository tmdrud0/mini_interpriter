package parser;

import java.util.*;

import javafx.util.Pair;
import parser.state.*;

public class TermState extends BasicState{
    static final State instance = new TermState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> toPower;
        
        toPower = new Pair<>(AllIdentifier.getInstance(), new LinkedList<>(
            Arrays.asList(PowerState.getInstance(),PTermState.getInstance())));

        transitions.add(toPower);
        return transitions;
    }
    public static State getInstance() {
        return instance;
    }
}