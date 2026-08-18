import java.util.Scanner;

public class Sakurakoandkosuke2033A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println("Sakurako");
            } else {
                System.out.println("Kosuke");
            }
        }

        scanner.close();
    }
}