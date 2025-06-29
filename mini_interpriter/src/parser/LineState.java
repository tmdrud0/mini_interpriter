package parser;

import java.util.*;

import javafx.util.Pair;
import parser.state.*;
import scanner.automata.Token;

public class LineState extends BasicState{
    static final State instance = new LineState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> print;
        Pair<TokenIdentifier, Queue<State>> assign;

        print = new Pair<>(new SameIdentifier(new Token(26)), new LinkedList<>(
            Arrays.asList(PrintState.getInstance())));
        assign = new Pair<>(new SameIdentifier(new Token(3)), new LinkedList<>(
            Arrays.asList(AssignState.getInstance())));

        transitions.add(print);
        transitions.add(assign);
        return transitions;
    }
    public static State getInstance() {
        return instance;
    }
}