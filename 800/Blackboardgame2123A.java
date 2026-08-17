import java.util.Scanner;

public class Blackboardgame2123A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            if (n % 4 == 0 || n % 4 == 3) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        }

        scanner.close();
    }
}