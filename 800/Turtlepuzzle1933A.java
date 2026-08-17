import java.util.Scanner;

public class Turtlepuzzle1933A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int sum = 0;

            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                sum += Math.abs(x);
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}