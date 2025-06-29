package parser;

import java.util.*;
import javafx.util.Pair;

import parser.state.*;
import parser.state.symbolstate.*;
import parser.state.operationstate.*;
import scanner.automata.Token;

public class AssignState extends BasicState{
    static final State instance = new AssignState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> assign;

        assign = new Pair<>(new SameIdentifier(new Token(3)), new LinkedList<>(
            Arrays.asList(PushIdOp.getInstance(),IdState.getInstance(),EqualState.getInstance(),
            ExpresionState.getInstance(),AssignOp.getInstance())));

        transitions.add(assign);
        return transitions;
    }
    public static State getInstance() {
        return instance;
    }
}