import java.util.Scanner;

public class Shizukuhoshikawaandfarmlegs2171A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();

            if (n % 2 != 0) {
                System.out.println(0);
                continue;
            }

            System.out.println((n / 4) + 1);
        }

        scanner.close();
    }
}