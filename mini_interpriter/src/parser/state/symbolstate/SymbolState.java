package parser.state.symbolstate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javafx.util.Pair;
import parser.state.AllIdentifier;
import parser.state.State;
import parser.state.TokenIdentifier;
import scanner.automata.Token;

public abstract class SymbolState extends State{

    @Override
    protected List<Pair<TokenIdentifier, Queue<State>>> getTransitions() {
        List<Pair<TokenIdentifier, Queue<State>>> transitions = new ArrayList<>();
        Pair<TokenIdentifier, Queue<State>> pair = new Pair<>(AllIdentifier.getInstance(), new LinkedList<>());
        transitions.add(pair);
        return transitions;
    }
    @Override
    protected void operation(Token token) {}
}