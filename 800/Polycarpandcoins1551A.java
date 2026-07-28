import java.util.Scanner;

public class Polycarpandcoins1551A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long c2 = n / 3;
            long c1 = n / 3;

            long rem = n % 3;
            if (rem == 1) {
                c1++;
            } else if (rem == 2) {
                c2++;
            }

            System.out.println(c1 + " " + c2);
        }

        scanner.close();
    }
}