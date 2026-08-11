import java.util.Scanner;

public class Drawasqaure2074A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long d = scanner.nextLong();
            long u = scanner.nextLong();

            if (l == r && r == d && d == u) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}