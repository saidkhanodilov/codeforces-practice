import java.util.Scanner;

public class Oddset1542A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int oddCount = 0;
            int evenCount = 0;

            for (int j = 0; j < 2 * n; j++) {
                int a = scanner.nextInt();
                if (a % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            if (oddCount == evenCount) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}