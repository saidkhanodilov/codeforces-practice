import java.util.Scanner;
public class Arrangingcats1921B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String f = scanner.next();
            int remove = 0, add = 0;
            for (int i = 0; i < n; i++) {
                char sc = s.charAt(i);
                char fc = f.charAt(i);
                if (sc == '1' && fc == '0') remove++;
                else if (sc == '0' && fc == '1') add++;
            }
            int ans = Math.max(remove, add);
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}