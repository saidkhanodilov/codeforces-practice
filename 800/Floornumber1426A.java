import java.util.Scanner;

public class Floornumber1426A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            if (n <= 2) {
                System.out.println(1);
            } else {
                int remaining = n - 2;
                int floors = (remaining + x - 1) / x + 1;
                System.out.println(floors);
            }
        }

        scanner.close();
    }
}