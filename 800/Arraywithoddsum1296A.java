import java.util.Scanner;

public class Arraywithoddsum1296A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            boolean hasOdd = false;
            boolean hasEven = false;

            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                sum += a;
                if (a % 2 != 0) {
                    hasOdd = true;
                } else {
                    hasEven = true;
                }
            }

            if (sum % 2 != 0) {
                System.out.println("YES");
            } else {
                if (hasOdd && hasEven) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        scanner.close();
    }
}