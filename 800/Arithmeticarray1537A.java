import java.util.Scanner;

public class Arithmeticarray1537A {
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
                sum += scanner.nextInt();
            }

            if (sum == n) {
                System.out.println(0);
            } else if (sum < n) {
                System.out.println(1);
            } else {
                System.out.println(sum - n);
            }
        }

        scanner.close();
    }
}