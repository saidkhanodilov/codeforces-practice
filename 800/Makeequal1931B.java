import java.util.Scanner;
public class Makeequal1931B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                total += a[i];
            }
            long target = total / n;
            long prefix = 0;
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                prefix += a[i];
                if (prefix < target * (i + 1)) { ok = false; break; }
            }
            sb.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}