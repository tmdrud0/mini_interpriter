import java.util.LinkedList;

import parser.LineState;
import parser.state.State;
import scanner.Scanner;
import scanner.automata.Token;

public class MiniInterpriter {
    Scanner myScanner;
    State lineState;

    public MiniInterpriter(){
        myScanner = new Scanner();
        lineState = LineState.getInstance();
    }

    public Boolean run(String line){
        LinkedList<Token> tokens = new LinkedList<>();
        tokens.addAll(myScanner.scan(line));
        return lineState.tlqk(tokens);
    }
}