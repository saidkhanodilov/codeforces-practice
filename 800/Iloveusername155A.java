import java.util.Scanner;

public class Iloveusername155A {
    public static void main(String args[]) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int n = scanner.nextInt();

        int firstScore = scanner.nextInt();
        int minValue = firstScore;
        int maxValue = firstScore;
        int count = 0;

        // Loop through the remaining n - 1 contests
        for (int i = 1; i < n; i++) {
            int input = scanner.nextInt();

            if (input > maxValue) {
                maxValue = input;
                count++;
            }
            else if (input < minValue) {
                minValue = input;
                count++;
            }
        }

        // Output
        System.out.println(count);
        scanner.close();
    }
}