import java.util.Scanner;

public class Fibonacciness2060A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a4 = scanner.nextInt();
            int a5 = scanner.nextInt();

            int maxFib = 0;

            // Try possible values for a3
            int[] possibleA3 = {
                    a1 + a2,
                    a4 - a2,
                    a5 - a4
            };

            for (int a3 : possibleA3) {
                int count = 0;
                if (a3 == a1 + a2) count++;
                if (a4 == a2 + a3) count++;
                if (a5 == a3 + a4) count++;

                maxFib = Math.max(maxFib, count);
            }

            System.out.println(maxFib);
        }

        scanner.close();
    }
}