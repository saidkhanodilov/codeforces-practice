import java.util.Scanner;

public class Collectingcoins1294A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long n = scanner.nextLong();

            long sum = a + b + c + n;

            if (sum % 3 != 0) {
                System.out.println("NO");
            } else {
                long target = sum / 3;
                if (target >= a && target >= b && target >= c) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        scanner.close();
    }
}