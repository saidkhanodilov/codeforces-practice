import java.util.Scanner;

public class Phoenixandbalance1348A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            long sum1 = (1L << n);
            for (int j = 1; j < n / 2; j++) {
                sum1 += (1L << j);
            }

            long sum2 = 0;
            for (int j = n / 2; j < n; j++) {
                sum2 += (1L << j);
            }

            System.out.println(Math.abs(sum1 - sum2));
        }

        scanner.close();
    }
}