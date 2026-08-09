import java.util.Scanner;

public class Robinhelps2014A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int gold = 0;
            int givenCount = 0;

            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                if (a >= k) {
                    gold += a;
                } else if (a == 0) {
                    if (gold > 0) {
                        gold--;
                        givenCount++;
                    }
                }
            }

            System.out.println(givenCount);
        }

        scanner.close();
    }
}