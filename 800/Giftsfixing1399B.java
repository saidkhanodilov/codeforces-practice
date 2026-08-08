import java.util.Scanner;

public class Giftsfixing1399B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            long minA = Long.MAX_VALUE;
            long minB = Long.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextLong();
                if (a[j] < minA) {
                    minA = a[j];
                }
            }

            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextLong();
                if (b[j] < minB) {
                    minB = b[j];
                }
            }

            long totalMoves = 0;
            for (int j = 0; j < n; j++) {
                long diffA = a[j] - minA;
                long diffB = b[j] - minB;
                totalMoves += Math.max(diffA, diffB);
            }

            System.out.println(totalMoves);
        }

        scanner.close();
    }
}