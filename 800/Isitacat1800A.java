import java.util.Scanner;
public class Isitacat1800A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String lower = s.toLowerCase();
            boolean ok = lower.matches("m+e+o+w+");
            sb.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}