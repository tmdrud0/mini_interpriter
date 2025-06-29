package parser;

import java.util.*;

import javafx.util.Pair;
import parser.state.*;
import parser.state.symbolstate.*;
import parser.state.operationstate.*;
import scanner.automata.Token;

public class PTermState extends BasicState{
    static final State instance = new PTermState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> mul;
        Pair<TokenIdentifier, Queue<State>> div;
        Pair<TokenIdentifier, Queue<State>> empty;

        mul = new Pair<>(new SameIdentifier(new Token(12)), new LinkedList<>(
            Arrays.asList(MultiState.getInstance(),PowerState.getInstance(),MulOp.getInstance(),PTermState.getInstance())));
        div = new Pair<>(new SameIdentifier(new Token(13)), new LinkedList<>(
            Arrays.asList(DivState.getInstance(),PowerState.getInstance(),DivOp.getInstance(),PTermState.getInstance())));
        empty = new Pair<>(AllIdentifier.getInstance(), new LinkedList<>(
            Arrays.asList(EmptyState.getInstance())));

        transitions.add(mul);
        transitions.add(div);
        transitions.add(empty);
        return transitions;
    }

    public static State getInstance() {
        return instance;
    }
}