import java.util.Scanner;

public class Sumofroundnumbers1352A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input
        int t = scanner.nextInt();
        // Process
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] roundNumbers = new int[5];

            int count = 0;
            int factor = 1;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 0) {

                    roundNumbers[count] = digit * factor;
                    count++;
                }
                factor = factor * 10;
                n = n / 10;
            }
            System.out.println(count);
            // Output
            for (int j = 0; j < count; j++) {
                System.out.print(roundNumbers[j] + " ");
            }
            System.out.println();
        }
    }
}