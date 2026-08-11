import java.util.Scanner;

public class Primarytask2000A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();

            if (s.length() >= 3 && s.startsWith("10") && s.charAt(2) != '0') {
                int exponent = Integer.parseInt(s.substring(2));
                if (exponent >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}