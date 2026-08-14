import java.util.Scanner;

public class Parklighting1358A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();

            long totalSquares = n * m;
            long ans = (totalSquares + 1) / 2;

            System.out.println(ans);
        }

        scanner.close();
    }
}