import java.util.Arrays;
import java.util.Scanner;

public class Removesmallest1399A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int a0 = 0; a0 < n; a0++) {
            int m = scanner.nextInt();
            int[] arr = new int[m];

            for (int a1 = 0; a1 < m; a1++) {
                arr[a1] = scanner.nextInt();
            }
            Arrays.sort(arr);

            boolean possible = true;
            for (int i = 0; i < m - 1; i++) {
                if (arr[i + 1] - arr[i] > 1) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}