import java.util.Scanner;

public class Rudolfandtheticket1941A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }

            int[] c = new int[m];
            for (int j = 0; j < m; j++) {
                c[j] = scanner.nextInt();
            }

            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (b[j] + c[l] <= k) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}