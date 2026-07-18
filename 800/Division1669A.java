import java.util.Scanner;

public class Division1669A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                int rating = scanner.nextInt();

                // Determine the division based on rating
                if (rating >= 1900) {
                    System.out.println("Division 1");
                } else if (rating >= 1600) {
                    System.out.println("Division 2");
                } else if (rating >= 1400) {
                    System.out.println("Division 3");
                } else {
                    System.out.println("Division 4");
                }
            }
        }

        scanner.close();
    }
}