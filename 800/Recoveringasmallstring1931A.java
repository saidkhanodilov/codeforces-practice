import java.util.Scanner;

public class Recoveringasmallstring1931A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            char[] word = new char[3];


            for (int j = 2; j >= 0; j--) {
                // Try to take as large a value as needed, but at least 1, and at most 26.
                // Remaining sum needed for the previous positions is j (since each needs at least 1).
                int val = Math.min(n - j, 26);
                word[j] = (char) ('a' + val - 1);
                n -= val;
            }

            System.out.println(new String(word));
        }

        scanner.close();
    }
}