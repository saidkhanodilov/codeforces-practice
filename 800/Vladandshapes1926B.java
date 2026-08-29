import java.util.Scanner;
public class Vladandshapes1926B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            char[][] grid = new char[n][];
            for (int i = 0; i < n; i++) grid[i] = scanner.next().toCharArray();

            int r1 = n, r2 = -1, c1 = n, c2 = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1') {
                        if (i < r1) r1 = i;
                        if (i > r2) r2 = i;
                        if (j < c1) c1 = j;
                        if (j > c2) c2 = j;
                    }
                }
            }

            int height = r2 - r1 + 1;
            int width = c2 - c1 + 1;
            boolean isSquare = false;

            if (height == width) {
                isSquare = true;
                for (int i = r1; i <= r2 && isSquare; i++) {
                    for (int j = c1; j <= c2; j++) {
                        if (grid[i][j] != '1') { isSquare = false; break; }
                    }
                }
            }

            sb.append(isSquare ? "SQUARE" : "TRIANGLE").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}