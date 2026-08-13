import java.util.Scanner;

public class DBMBandthearray2193A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int x = scanner.nextInt();

            int currentSum = 0;
            for (int j = 0; j < n; j++) {
                currentSum += scanner.nextInt();
            }

            if (s < currentSum) {
                System.out.println("NO");
            } else if ((s - currentSum) % x == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}