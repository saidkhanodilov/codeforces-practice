import java.util.Scanner;

public class Ordinarynumbers1520B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long count = 0;

            for (int d = 1; d <= 9; d++) {
                long current = d;
                while (current <= n) {
                    count++;
                    current = current * 10 + d;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}