package scanner;

import java.util.List;

import scanner.automata.Token;

public class TestScanner {
    public static void main(String[] args) throws Exception {
        Scanner myScanner= new Scanner();
        MyFileReader myFileReader = new MyFileReader();

        String input = myFileReader.readInput();
        System.out.println(input);

        List<Token> result = myScanner.scan(input);
        result.forEach((item)->System.out.println(item));
    }
}