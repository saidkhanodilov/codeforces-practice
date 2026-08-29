import java.util.Scanner;
public class Linebreaks2050A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int total = 0;
            int x = 0;
            for (int i = 0; i < n; i++) {
                String w = scanner.next();
                if (total + w.length() <= m) {
                    total += w.length();
                    x++;
                }
            }
            sb.append(x).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}