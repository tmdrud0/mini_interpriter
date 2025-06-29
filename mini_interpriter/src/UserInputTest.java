import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args) throws Exception {
        MiniInterpriter myInterpriter = new MiniInterpriter();
        Scanner scanner = new Scanner(System.in);

        while(myInterpriter.run(scanner.nextLine()));
        System.out.println("parse error");
        
        scanner.close();
    }
}