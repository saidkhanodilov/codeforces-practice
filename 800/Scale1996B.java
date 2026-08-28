import java.util.Scanner;
public class Scale1996B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String[] grid = new String[n];
            for (int i = 0; i < n; i++) grid[i] = scanner.next();
            int m = n / k;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    sb.append(grid[i * k].charAt(j * k));
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
        scanner.close();
    }
}