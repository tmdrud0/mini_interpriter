package scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import scanner.automata.Automata;
import scanner.automata.DFA;
import scanner.automata.IdentifierGenerator;
import scanner.automata.NoIdTokenManager;
import scanner.automata.State;
import scanner.automata.StateImpl;

public abstract class WordDFAGenarator {

    private ArrayList<Character> notEndCharacter;
    public WordDFAGenarator(){
        notEndCharacter = getNotEndAlphabet();
    }

    abstract public ArrayList<Character> getNotEndAlphabet();
    
    public Automata buildAutomata(String goalString, int tokenNum) {
        DFA resultAutomata = new DFA(new NoIdTokenManager(tokenNum));
        List<State> states = new ArrayList<>(goalString.length()+1);
        for (int i = 0; i < goalString.length()+1; i++)  states.add(new StateImpl());
        IdentifierGenerator ig = new IdentifierGenerator();
        resultAutomata.setStartState(states.get(0));

        for(int i=1;i<states.size();i++){
            states.get(i-1)
            .addTransition(
                ig.makeHasIdentifier(
                    new ArrayList<Character>(Arrays.asList(goalString.charAt(i-1)))), states.get(i));
        }

        states.get(goalString.length())
        .addTransition(ig.makeNotHasIdentifier(notEndCharacter), State.OK);
        return resultAutomata;
    }
}