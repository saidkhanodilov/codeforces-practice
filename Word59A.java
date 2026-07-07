import java.util.Scanner;
public class Word59A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Process
        int upperCases = 0;
        int lowerCases = 0;
        for (int i = 0; i < input.length(); i++) {
           char c =  input.charAt(i);
           if(Character.isUpperCase(c)) {
               upperCases++;
           }
           if(Character.isLowerCase(c)) {
               lowerCases++;
           }
        }
        if(upperCases < lowerCases) {
            System.out.println(input.toLowerCase());
        }
        else if(lowerCases < upperCases) {
            System.out.println(input.toUpperCase());
        }
        else  {
            System.out.println(input.toLowerCase());
        }
        // Output
    }
}