import java.util.Scanner;

public class Journey2051B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            long n = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            long cycleSum = a + b + c;
            long fullCycles = n / cycleSum;
            long days = fullCycles * 3;
            long covered = fullCycles * cycleSum;

            if (covered >= n) {
                System.out.println(days);
                continue;
            }

            covered += a;
            days++;
            if (covered >= n) {
                System.out.println(days);
                continue;
            }

            covered += b;
            days++;
            if (covered >= n) {
                System.out.println(days);
                continue;
            }

            covered += c;
            days++;
            System.out.println(days);
        }

        scanner.close();
    }
}