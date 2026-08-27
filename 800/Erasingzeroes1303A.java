import java.util.Scanner;
public class Erasingzeroes1303A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            String s = scanner.next();
            int first = s.indexOf('1');
            int last = s.lastIndexOf('1');
            int ans = 0;
            if (first != -1) {
                for (int i = first; i <= last; i++) {
                    if (s.charAt(i) == '0') ans++;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}