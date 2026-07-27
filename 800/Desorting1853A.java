import java.util.Scanner;

public class Desorting1853A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            boolean sorted = true;
            int minDiff = Integer.MAX_VALUE;

            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    sorted = false;
                    break;
                }
                int diff = a[j + 1] - a[j];
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }

            if (!sorted) {
                out.append(0).append("\n");
            } else {
                out.append((minDiff / 2) + 1).append("\n");
            }
        }
        System.out.print(out);
        scanner.close();
    }
}