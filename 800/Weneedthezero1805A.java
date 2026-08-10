import java.util.Scanner;

public class Weneedthezero1805A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int xorSum = 0;

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                xorSum ^= a[j];
            }

            if (n % 2 != 0) {
                System.out.println(xorSum);
            } else {
                if (xorSum == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(-1);
                }
            }
        }

        scanner.close();
    }
}