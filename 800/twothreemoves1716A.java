import java.util.Scanner;
public class twothreemoves1716A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long n = scanner.nextLong();
            long ans;
            if (n % 3 == 0) {
                ans = n / 3;
            } else if (n % 3 == 1) {
                ans = (n == 1) ? 2 : (n / 3 + 1);
            } else {
                ans = n / 3 + 1;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}