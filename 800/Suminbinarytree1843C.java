import java.util.Scanner;

public class Suminbinarytree1843C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long sum = 0;

            while (n > 0) {
                sum += n;
                n /= 2;
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}