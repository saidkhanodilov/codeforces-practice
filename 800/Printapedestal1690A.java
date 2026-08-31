import java.util.Scanner;
public class Printapedestal1690A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long n = scanner.nextLong();
            long h1 = (n + 3 + 2) / 3;
            long remaining = n - h1;
            long h2 = Math.min(h1 - 1, remaining - 1);
            long h3 = remaining - h2;
            sb.append(h2).append(" ").append(h1).append(" ").append(h3).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}