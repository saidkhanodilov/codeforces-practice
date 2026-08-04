import java.util.Scanner;

public class Forbiddeninteger1845A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int x = scanner.nextInt();

            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int j = 0; j < n; j++) {
                    System.out.print(1 + (j == n - 1 ? "" : " "));
                }
                System.out.println();
            } else {
                if (k == 1) {
                    System.out.println("NO");
                } else if (n % 2 == 0) {
                    System.out.println("YES");
                    int m = n / 2;
                    System.out.println(m);
                    for (int j = 0; j < m; j++) {
                        System.out.print(2 + (j == m - 1 ? "" : " "));
                    }
                    System.out.println();
                } else {
                    if (k >= 3) {
                        System.out.println("YES");
                        int m = (n - 3) / 2 + 1;
                        System.out.println(m);
                        System.out.print(3);
                        for (int j = 0; j < m - 1; j++) {
                            System.out.print(" 2");
                        }
                        System.out.println();
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }

        scanner.close();
    }
}