import java.util.Scanner;

public class Cardsforfriends1472A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long w = scanner.nextLong();
            long h = scanner.nextLong();
            long n = scanner.nextLong();

            long pieces = 1;

            while (w % 2 == 0) {
                w /= 2;
                pieces *= 2;
            }

            while (h % 2 == 0) {
                h /= 2;
                pieces *= 2;
            }

            if (pieces >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}