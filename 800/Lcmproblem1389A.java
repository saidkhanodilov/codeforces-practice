import java.util.Scanner;

public class Lcmproblem1389A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();

            if (2 * l <= r) {
                System.out.println(l + " " + (2 * l));
            } else {
                System.out.println("-1 -1");
            }
        }

        scanner.close();
    }
}