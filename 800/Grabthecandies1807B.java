import java.util.Scanner;

public class Grabthecandies1807B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                if (a % 2 == 0) {
                    evenSum += a;
                } else {
                    oddSum += a;
                }
            }

            if (evenSum > oddSum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}