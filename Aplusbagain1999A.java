import java.util.Scanner;

public class Aplusbagain1999A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            int tens = n / 10;
            int ones = n % 10;
        // Output
            System.out.println(tens + ones);
        }
    }
}