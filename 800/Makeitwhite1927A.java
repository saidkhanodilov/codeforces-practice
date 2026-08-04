import java.util.Scanner;

public class Makeitwhite1927A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int firstBlack = s.indexOf('B');
            int lastBlack = s.lastIndexOf('B');

            int length = lastBlack - firstBlack + 1;
            System.out.println(length);
        }

        scanner.close();
    }
}