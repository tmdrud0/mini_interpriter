package scanner;

import java.util.ArrayList;

import scanner.automata.Automata;
import scanner.automata.AutomataBuilder;
import scanner.automata.AutomataSet;
import javafx.util.Pair;

public abstract class WordDFABuilder implements AutomataBuilder{

    ArrayList<Pair<String,Integer>> tokens;
    WordDFAGenarator genarator;
    public WordDFABuilder(){
        genarator = getGenarator();
        tokens = getTokens();

    }
    abstract WordDFAGenarator getGenarator();
    abstract ArrayList<Pair<String,Integer>> getTokens();
    @Override
    public Automata buildAutomata() {
        AutomataSet resultAutomata = new AutomataSet();
        tokens.stream()
        .map((item)->genarator.buildAutomata(item.getKey(), item.getValue()))
        .forEach((automata)->resultAutomata.addAutomata(automata));
        
        return resultAutomata;
    }
    
}