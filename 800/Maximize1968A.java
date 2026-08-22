import java.util.Scanner;
public class Maximize1968A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int spf = x;
            for (int d = 2; d * d <= x; d++) {
                if (x % d == 0) {
                    spf = d;
                    break;
                }
            }
            sb.append(x - spf).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}