import java.util.Scanner;

public class Hardproblem2044C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long m = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            long row1Seated = Math.min(a, m);
            long row2Seated = Math.min(b, m);

            long remainingRow1 = m - row1Seated;
            long remainingRow2 = m - row2Seated;

            long fromCFor1 = Math.min(c, remainingRow1);
            c -= fromCFor1;

            long fromCFor2 = Math.min(c, remainingRow2);
            c -= fromCFor2;

            long totalSeated = row1Seated + fromCFor1 + row2Seated + fromCFor2;
            System.out.println(totalSeated);
        }

        scanner.close();
    }
}