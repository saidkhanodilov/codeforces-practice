//import java.util.Scanner;
//import java.lang.String;
//public class Team231A {
//    public static void main(String[] args) {
//        // Take input
//        Scanner scanner = new Scanner(System.in);
//        int inputInteger = scanner.nextInt();
//        int[] inputMultipleIntegers = new int[inputInteger];
//        int totalValue = 0;
//        for (int i = 0; i < inputInteger; i++) {
//            inputMultipleIntegers[i] = scanner.nextInt();
//            String firstNumberAsString = String.valueOf(inputMultipleIntegers[0]);
//            String secondNumberAsString = String.valueOf(inputMultipleIntegers[1]);
//            String thirdNumberAsString = String.valueOf(inputMultipleIntegers[2]);
//
//            char digitChar1 = firstNumberAsString.charAt(0);
//            int digit1 = digitChar1 - '0';
//            char digitChar2 = secondNumberAsString.charAt(0);
//            int digit2 = digitChar2 - '0';
//            char digitChar3 = thirdNumberAsString.charAt(0);
//            int digit3 = digitChar3 - '0';
//            if (digit1 + digit2 + digit3 >= 2) {
//                 totalValue++;
//            }
            // Process

//        String firstNumberAsString = String.valueOf(inputMultipleIntegers[0]);
//        String secondNumberAsString = String.valueOf(inputMultipleIntegers[1]);
//        String thirdNumberAsString = String.valueOf(inputMultipleIntegers[2]);
//
//        char digitChar1 = firstNumberAsString.charAt(0);
//        int digit1 = digitChar1 - '0';
//        char digitChar2 = secondNumberAsString.charAt(0);
//        int digit2 = digitChar2 - '0';
//        char digitChar3 = thirdNumberAsString.charAt(0);
//        int digit3 = digitChar3 - '0';

//        int firstNumberAsInt = Integer.parseInt(firstNumberAsString);
//        int secondNumberAsInt = Integer.parseInt(secondNumberAsString);
//        int thirdNumberAsInt = Integer.parseInt(thirdNumberAsString);
//        }
//    }
//}
import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalValue = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b + c >= 2) {
                totalValue++;
            }
        }

        System.out.println(totalValue);
    }
}