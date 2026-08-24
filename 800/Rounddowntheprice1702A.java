import java.util.Scanner;

public class Rounddowntheprice1702A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long m = scanner.nextLong();
            long p = 1;

            while (p * 10 <= m) {
                p *= 10;
            }

            System.out.println(m - p);
        }

        scanner.close();
    }
}