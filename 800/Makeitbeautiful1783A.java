import java.util.Scanner;

public class Makeitbeautiful1783A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            if (a[0] == a[n - 1]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int[] res = new int[n];
                res[0] = a[0];
                res[1] = a[n - 1];
                for (int j = 1; j < n - 1; j++) {
                    res[j + 1] = a[j];
                }

                for (int j = 0; j < n; j++) {
                    System.out.print(res[j] + (j == n - 1 ? "" : " "));
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}