import  java.util.Scanner;
public class Wrongsubtraction977A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int subtracTimes = scanner.nextInt();
        // Process
        for (int i = 0; i < subtracTimes; i++) {
            String asString = String.valueOf(input);
            char charLast = asString.charAt(asString.length()-1);
            int lastDigit = Character.getNumericValue(charLast);
            if(lastDigit == 0) {
                input = input/10;
            }
            else {
                input = input-1;
            }
        }
        // Output
        System.out.println(input);
    }
}