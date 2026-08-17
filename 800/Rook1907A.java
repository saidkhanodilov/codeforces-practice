import java.util.Scanner;

public class Rook1907A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            char col = s.charAt(0);
            char row = s.charAt(1);

            // Output all moves along the same column
            for (char c = '1'; c <= '8'; c++) {
                if (c != row) {
                    System.out.println("" + col + c);
                }
            }

            // Output all moves along the same row
            for (char c = 'a'; c <= 'h'; c++) {
                if (c != col) {
                    System.out.println("" + c + row);
                }
            }
        }

        scanner.close();
    }
}