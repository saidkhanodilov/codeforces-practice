import java.util.Scanner;

public class Systemofequations214A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int count = 0;

        for (int a = 0; a * a <= n && a <= m; a++) {
            int b = n - a * a;
            if (a + b * b == m) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}