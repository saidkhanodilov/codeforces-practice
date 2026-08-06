import java.util.Scanner;

public class Twinpermutations1831A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                int b = n + 1 - a;
                System.out.print(b + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}