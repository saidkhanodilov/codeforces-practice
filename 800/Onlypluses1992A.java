import java.util.Scanner;

public class Onlypluses1992A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            for (int op = 0; op < 5; op++) {
                if (a <= b && a <= c) {
                    a++;
                } else if (b <= a && b <= c) {
                    b++;
                } else {
                    c++;
                }
            }

            long maxProduct = (long) a * b * c;
            System.out.println(maxProduct);
        }

        scanner.close();
    }
}