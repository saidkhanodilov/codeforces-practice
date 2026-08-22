import java.util.Scanner;
public class Socialexperiment2184A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int ans;
            if (n == 2) {
                ans = 2;
            } else if (n == 3) {
                ans = 3;
            } else if (n % 2 == 0) {
                ans = 0;
            } else {
                ans = 1;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}