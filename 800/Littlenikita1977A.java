import java.util.Scanner;
public class Littlenikita1977A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            boolean ok = m <= n && (n - m) % 2 == 0;
            sb.append(ok ? "Yes" : "No").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}