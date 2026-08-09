import java.util.Scanner;

public class Cplusequal1368A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long n = scanner.nextLong();

            int ops = 0;
            while (a <= n && b <= n) {
                if (a < b) {
                    a += b;
                } else {
                    b += a;
                }
                ops++;
            }

            System.out.println(ops);
        }

        scanner.close();
    }
}