import java.util.Scanner;
public class Drtc2196A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            long cnt = 0;
            for (int i = 0; i < n; i++) if (s.charAt(i) == '1') cnt++;
            long ans = (long) n * cnt + n - 2 * cnt;
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}