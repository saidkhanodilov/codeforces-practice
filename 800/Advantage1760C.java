import java.util.Scanner;
import java.util.Arrays;

public class Advantage1760C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] s = new int[n];
            int[] sorted = new int[n];

            for (int j = 0; j < n; j++) {
                s[j] = scanner.nextInt();
                sorted[j] = s[j];
            }

            Arrays.sort(sorted);
            int max1 = sorted[n - 1];
            int max2 = sorted[n - 2];

            for (int j = 0; j < n; j++) {
                int ans = (s[j] == max1) ? (s[j] - max2) : (s[j] - max1);
                System.out.print(ans + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        scanner.close();
    }
}