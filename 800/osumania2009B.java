import java.util.Scanner;

public class osumania2009B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] cols = new int[n];

            for (int r = 0; r < n; r++) {
                String row = scanner.next();
                for (int c = 0; c < 4; c++) {
                    if (row.charAt(c) == '#') {
                        cols[r] = c + 1;
                        break;
                    }
                }
            }

            for (int r = n - 1; r >= 0; r--) {
                System.out.print(cols[r] + (r == 0 ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}