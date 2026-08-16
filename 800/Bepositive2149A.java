import java.util.Scanner;

public class Bepositive2149A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int negatives = 0;
            int zeros = 0;

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (x < 0) {
                    negatives++;
                } else if (x == 0) {
                    zeros++;
                }
            }

            int required = (n + 1) / 2;
            int ops = 0;

            if (negatives > required) {
                ops += (negatives - required);
                negatives = required;
            }

            if (negatives % 2 != 0) {
                if (zeros > 0) {
                    ops += 1;
                    zeros--;
                } else {
                    ops += 2;
                }
            }

            ops += zeros;

            System.out.println(ops);
        }

        scanner.close();
    }
}