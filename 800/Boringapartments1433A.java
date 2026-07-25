import java.util.Scanner;

public class Boringapartments1433A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String x = scanner.next();
            int digit = x.charAt(0) - '0';
            int length = x.length();

            int totalDigits = (digit - 1) * 10 + (length * (length + 1)) / 2;

            System.out.println(totalDigits);
        }
        scanner.close();
    }
}