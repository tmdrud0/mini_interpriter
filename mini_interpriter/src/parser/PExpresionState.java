package parser;

import java.util.*;

import javafx.util.Pair;
import parser.state.*;
import parser.state.symbolstate.*;
import parser.state.operationstate.*;
import scanner.automata.Token;

public class PExpresionState extends BasicState{
    static final State instance = new PExpresionState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> add;
        Pair<TokenIdentifier, Queue<State>> sub;
        Pair<TokenIdentifier, Queue<State>> empty;

        add = new Pair<>(new SameIdentifier(new Token(10)), new LinkedList<>(
            Arrays.asList(PlusState.getInstance(),TermState.getInstance(),AddOp.getInstance(),PExpresionState.getInstance())));
        sub = new Pair<>(new SameIdentifier(new Token(11)), new LinkedList<>(
            Arrays.asList(MinusState.getInstance(),TermState.getInstance(),SubOp.getInstance(),PExpresionState.getInstance())));
        empty = new Pair<>(AllIdentifier.getInstance(), new LinkedList<>(
            Arrays.asList(EmptyState.getInstance())));

        transitions.add(add);
        transitions.add(sub);
        transitions.add(empty);
        return transitions;
    }

    public static State getInstance() {
        return instance;
    }
}