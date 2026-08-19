import java.util.Scanner;

public class Cypher1703C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int b = scanner.nextInt();
                String moves = scanner.next();

                int current = a[i];
                for (int j = 0; j < b; j++) {
                    char move = moves.charAt(j);
                    if (move == 'U') {
                        // Reversing an 'U' move means we subtract 1
                        current = (current - 1 + 10) % 10;
                    } else if (move == 'D') {
                        // Reversing a 'D' move means we add 1
                        current = (current + 1) % 10;
                    }
                }
                a[i] = current;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}