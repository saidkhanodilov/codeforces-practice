import java.util.Arrays;
import java.util.Scanner;

public class Unitedwestand1859A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            if (a[0] == a[n - 1]) {
                System.out.println(-1);
            } else {
                int idx = 0;
                while (idx < n && a[idx] == a[0]) {
                    idx++;
                }

                System.out.println(idx + " " + (n - idx));

                for (int i = 0; i < idx; i++) {
                    System.out.print(a[i] + (i == idx - 1 ? "" : " "));
                }
                System.out.println();

                for (int i = idx; i < n; i++) {
                    System.out.print(a[i] + (i == n - 1 ? "" : " "));
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}