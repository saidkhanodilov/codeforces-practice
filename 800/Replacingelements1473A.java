import java.util.Arrays;
import java.util.Scanner;

public class Replacingelements1473A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            boolean possible = true;
            for (int i = 0; i < n; i++) {
                if (a[i] > d) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                if (a[0] + a[1] <= d) {
                    possible = true;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}