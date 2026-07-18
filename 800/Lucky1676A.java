import java.util.Scanner;

public class Lucky1676A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                String ticket = scanner.next();
                // Process
                int firstSum = (ticket.charAt(0) - '0') +
                        (ticket.charAt(1) - '0') +
                        (ticket.charAt(2) - '0');

                int lastSum = (ticket.charAt(3) - '0') +
                        (ticket.charAt(4) - '0') +
                        (ticket.charAt(5) - '0');
                // Output
                if (firstSum == lastSum) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        scanner.close();
    }
}