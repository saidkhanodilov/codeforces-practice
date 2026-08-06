import java.util.Scanner;

public class Favoritesequence1462A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long[] b = new long[n];
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextLong();
            }

            long[] a = new long[n];
            int left = 0;
            int right = n - 1;

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    a[j] = b[left++];
                } else {
                    a[j] = b[right--];
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}