import java.util.Scanner;

public class Twoelevators1729A {
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

            long time1 = Math.abs(a - 1);
            long time2 = Math.abs(b - c) + Math.abs(c - 1);

            if (time1 < time2) {
                System.out.println(1);
            } else if (time2 < time1) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

        scanner.close();
    }
}