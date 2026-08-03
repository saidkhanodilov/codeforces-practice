import java.util.Scanner;

public class Yogurtsale1955A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int cost1 = n * a;
            int cost2 = (n / 2) * b + (n % 2) * a;

            System.out.println(Math.min(cost1, cost2));
        }

        scanner.close();
    }
}