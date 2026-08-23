import java.util.Scanner;
public class Vasyaandcoins1660A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long ans;
            if (a == 0) {
                ans = 1;
            } else {
                ans = a + 2 * b + 1;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}