import java.util.Scanner;

public class Extremelyround1766A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String nStr = scanner.next();
            int len = nStr.length();
            int firstDigit = nStr.charAt(0) - '0';

            int ans = (len - 1) * 9 + firstDigit;
            System.out.println(ans);
        }

        scanner.close();
    }
}