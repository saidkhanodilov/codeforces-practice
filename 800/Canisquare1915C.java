import java.util.Scanner;

public class Canisquare1915C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long totalSquares = 0;

            for (int j = 0; j < n; j++) {
                totalSquares += scanner.nextLong();
            }

            long sqrt = (long) Math.sqrt(totalSquares);

            if (sqrt * sqrt == totalSquares) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}