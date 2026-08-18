import java.util.Scanner;

public class Elections1593A {
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

            long maxAB = Math.max(a, b);
            long maxVotes = Math.max(maxAB, c);

            long ansA = 0;
            long ansB = 0;
            long ansC = 0;

            if (a > b && a > c) {
                ansA = 0;
            } else {
                ansA = maxVotes - a + 1;
            }

            if (b > a && b > c) {
                ansB = 0;
            } else {
                ansB = maxVotes - b + 1;
            }

            if (c > a && c > b) {
                ansC = 0;
            } else {
                ansC = maxVotes - c + 1;
            }

            System.out.println(ansA + " " + ansB + " " + ansC);
        }

        scanner.close();
    }
}