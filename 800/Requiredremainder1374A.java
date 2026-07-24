import java.util.Scanner;

public class Requiredremainder1374A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long n = scanner.nextLong();

            long target = n - y;
            long groups = target / x;
            long k = (groups * x) + y;

            System.out.println(k);
        }
        scanner.close();
    }
}
