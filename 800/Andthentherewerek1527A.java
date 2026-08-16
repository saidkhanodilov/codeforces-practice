import java.util.Scanner;

public class Andthentherewerek1527A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            int highestPowerOfTwo = 1;
            while ((highestPowerOfTwo << 1) <= n) {
                highestPowerOfTwo <<= 1;
            }

            System.out.println(highestPowerOfTwo - 1);
        }

        scanner.close();
    }
}