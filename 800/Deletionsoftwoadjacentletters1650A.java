import java.util.Scanner;
public class Deletionsoftwoadjacentletters1650A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            String s = scanner.next();
            String c = scanner.next();
            char target = c.charAt(0);
            boolean ok = false;
            for (int i = 0; i < s.length(); i += 2) {
                if (s.charAt(i) == target) { ok = true; break; }
            }
            sb.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}