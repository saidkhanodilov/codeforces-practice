import java.util.Scanner;

public class Angrymonk1992B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            long n = scanner.nextLong();
            int k = scanner.nextInt();

            long[] a = new long[k];
            int maxIndex = 0;
            long maxVal = -1;

            for (int i = 0; i < k; i++) {
                a[i] = scanner.nextLong();
                if (a[i] > maxVal) {
                    maxVal = a[i];
                    maxIndex = i;
                }
            }

            long operations = 0;

            for (int i = 0; i < k; i++) {
                if (i == maxIndex) {
                    continue;
                }

                operations += 2 * a[i] - 1;
            }

            System.out.println(operations);
        }

        scanner.close();
    }
}
