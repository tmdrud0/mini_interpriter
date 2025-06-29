package parser;

import java.util.*;
import javafx.util.Pair;

import parser.state.*;
import parser.state.symbolstate.*;
import parser.state.operationstate.*;
import scanner.automata.Token;

public class FactorState extends BasicState{
    static final State instance = new FactorState();
    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> bracket;
        Pair<TokenIdentifier, Queue<State>> constVal;
        Pair<TokenIdentifier, Queue<State>> id;

        bracket = new Pair<>(new SameIdentifier(new Token(34)), new LinkedList<>(
            Arrays.asList(OpenState.getInstance(),ExpresionState.getInstance(),CloseState.getInstance())));
        constVal = new Pair<>(new SameIdentifier(new Token(5)), new LinkedList<>(
            Arrays.asList(PushValOp.getInstance(),ConstantState.getInstance())));
        id = new Pair<>(new SameIdentifier(new Token(3)), new LinkedList<>(
            Arrays.asList(PushValOp.getInstance(),IdState.getInstance())));

        transitions.add(bracket);
        transitions.add(constVal);
        transitions.add(id);
        return transitions;
    }
    public static State getInstance() {
        return instance;
    } 
}