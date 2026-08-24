import java.util.Scanner;

public class Ciphershifer1840A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            StringBuilder decoded = new StringBuilder();

            for (int j = 0; j < n; j++) {
                char current = s.charAt(j);
                decoded.append(current);

                // Find the next occurrence of the current character
                int k = j + 1;
                while (k < n && s.charAt(k) != current) {
                    k++;
                }

                // Update j to k so that the loop skips past the encrypted segment
                j = k;
            }

            System.out.println(decoded.toString());
        }

        scanner.close();
    }
}