import java.util.Scanner;

public class Mahmoudandehabandtheevenoddgame959A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLong()) {
            return;
        }

        long n = scanner.nextLong();

        if (n % 2 == 0) {
            System.out.println("Mahmoud");
        } else {
            System.out.println("Ehab");
        }

        scanner.close();
    }
}