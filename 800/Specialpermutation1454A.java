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
                int val = (j % n) + 1;
                System.out.print(val + (j == n ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}