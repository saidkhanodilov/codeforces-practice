import java.util.Scanner;

public class Linetrip1901A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();

            int maxDist = a[0];

            for (int i = 0; i < n - 1; i++) {
                maxDist = Math.max(maxDist, a[i+1] - a[i]);
            }

            maxDist = Math.max(maxDist, (x - a[n-1]) * 2);

            System.out.println(maxDist);
        }
    }
}