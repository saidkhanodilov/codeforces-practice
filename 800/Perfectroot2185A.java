import java.util.Scanner;

public class Perfectroot2185A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            for (int j = 1; j <= n; j++) {
                System.out.print(j + (j == n ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}