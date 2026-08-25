import java.util.Scanner;

public class Choosingcubes1980B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int f = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int favVal = a[f - 1];

            int greaterCount = 0;
            int equalCount = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] > favVal) {
                    greaterCount++;
                } else if (a[i] == favVal) {
                    equalCount++;
                }
            }

            if (greaterCount >= k) {
                System.out.println("NO");
            } else if (greaterCount + equalCount <= k) {
                System.out.println("YES");
            } else {
                System.out.println("MAYBE");
            }
        }

        scanner.close();
    }
}