import java.util.Arrays;
import java.util.Scanner;

public class Triple1669B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            Arrays.sort(a);

            int ans = -1;
            for (int j = 0; j <= n - 3; j++) {
                if (a[j] == a[j + 1] && a[j] == a[j + 2]) {
                    ans = a[j];
                    break;
                }
            }

            System.out.println(ans);
        }

        scanner.close();
    }
}