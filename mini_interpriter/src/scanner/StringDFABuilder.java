package scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import scanner.automata.Automata;
import scanner.automata.AutomataBuilder;
import scanner.automata.DFA;
import scanner.automata.Identifier;
import scanner.automata.IdentifierGenerator;
import scanner.automata.NoIdTokenManager;
import scanner.automata.State;
import scanner.automata.StateImpl;

public class StringDFABuilder implements AutomataBuilder{
    List<Character> openSymbol, closeSymbol,nothing;
    IdentifierGenerator ig;
    public StringDFABuilder(){
        openSymbol = new ArrayList<>(Arrays.asList('‘'));
        closeSymbol = new ArrayList<>(Arrays.asList('’'));
        nothing = new ArrayList<>();
        ig = new IdentifierGenerator();
    }

    @Override
    public Automata buildAutomata() {
        DFA stringDFA = new DFA(new NoIdTokenManager(4));
        State start = new StateImpl();
        State open = new StateImpl();
        State close = new StateImpl();

        Identifier openIdentifier = ig.makeHasIdentifier(openSymbol);
        Identifier closeIdentifier = ig.makeHasIdentifier(closeSymbol);
        Identifier notCloseIdentifier = ig.makeNotHasIdentifier(closeSymbol);
        Identifier allIdentifier = ig.makeNotHasIdentifier(nothing);

        stringDFA.setStartState(start);
        start.addTransition(openIdentifier, open);
        
        open.addTransition(notCloseIdentifier, open);
        open.addTransition(closeIdentifier, close);

        close.addTransition(allIdentifier, State.OK);

        return stringDFA;
    }
}