import java.util.Scanner;

public class Everybodylikesgoodarrays1777A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextLong();
            }

            int ops = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] % 2 == a[j + 1] % 2) {
                    ops++;
                }
            }

            System.out.println(ops);
        }

        scanner.close();
    }
}