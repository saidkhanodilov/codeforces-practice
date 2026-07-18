import java.util.Scanner;
import java.lang.String;
public class Waytoolongwords71A {
    public  static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int integerInput = scanner.nextInt();
        String[] inputString = new String[integerInput];
        for (int i = 0; i < integerInput; i++) {
            inputString[i] = scanner.next();
        }
        // Statements
        for (int i = 0; i < integerInput; i++) {
            String finalWord = inputString[i];
            char firstChar = inputString[i].charAt(0);
            char lastChar = inputString[i].charAt(inputString[i].length()-1);
        // Output
                if (finalWord.length() > 10)
                    System.out.println("" + firstChar + (finalWord.length() - 2) + lastChar);
                else
                    System.out.println(inputString[i]);
        }
    }
}
