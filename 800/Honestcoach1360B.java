import java.util.Arrays;
import java.util.Scanner;

public class Honestcoach1360B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] s = new int[n];

            for (int j = 0; j < n; j++) {
                s[j] = scanner.nextInt();
            }

            Arrays.sort(s);

            int minDiff = Integer.MAX_VALUE;
            for (int j = 1; j < n; j++) {
                int diff = s[j] - s[j - 1];
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }

            System.out.println(minDiff);
        }

        scanner.close();
    }
}