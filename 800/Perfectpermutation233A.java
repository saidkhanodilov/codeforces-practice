import java.util.Scanner;

public class Perfectpermutation233A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("-1");
        } else {
            for (int i = 1; i <= n; i += 2) {
                System.out.print((i + 1) + " " + i + (i + 2 <= n ? " " : ""));
            }
            System.out.println();
        }

        scanner.close();
    }
}