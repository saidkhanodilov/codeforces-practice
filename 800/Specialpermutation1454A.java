import java.util.Scanner;

public class Specialpermutation1454A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            for (int j = 1; j <= n; j++) {
                int val;
                if (n % 2 == 0) {
                    if (j <= n / 2) {
                        val = j + n / 2;
                    } else {
                        val = j - n / 2;
                    }
                } else {
                    if (j <= n / 2 + 1) {
                        val = (j == n / 2 + 1) ? 1 : j + n / 2;
                    } else {
                        val = (j == n) ? n / 2 + 1 : j - (n / 2 + 1);
                    }
                }
                System.out.print(val + (j == n ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}