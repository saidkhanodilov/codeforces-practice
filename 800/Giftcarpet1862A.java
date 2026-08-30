import java.util.Scanner;
public class Giftcarpet1862A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        String target = "vika";
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] grid = new char[n][];
            for (int i = 0; i < n; i++) grid[i] = scanner.next().toCharArray();

            int idx = 0;
            for (int j = 0; j < m && idx < 4; j++) {
                for (int i = 0; i < n; i++) {
                    if (grid[i][j] == target.charAt(idx)) {
                        idx++;
                        break;
                    }
                }
            }
            sb.append(idx == 4 ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}