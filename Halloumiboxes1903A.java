import java.util.Scanner;

public class Halloumiboxes1903A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
        // Process
            if (k >= 2) {
                System.out.println("YES");
            } else {
                boolean sorted = true;
                for (int i = 0; i < n - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
                if (sorted) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}