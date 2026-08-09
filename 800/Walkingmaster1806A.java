import java.util.Scanner;

public class Walkingmaster1806A {
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
            long d = scanner.nextLong();

            if (d < b) {
                System.out.println(-1);
            } else {
                long diffY = d - b;
                long newX = a + diffY;
                if (c > newX) {
                    System.out.println(-1);
                } else {
                    long diffX = newX - c;
                    System.out.println(diffY + diffX);
                }
            }
        }

        scanner.close();
    }
}