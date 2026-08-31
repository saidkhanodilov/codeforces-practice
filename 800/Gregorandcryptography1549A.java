import java.util.Scanner;
public class Gregorandcryptography1549A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long p = scanner.nextLong();
            sb.append(2).append(" ").append(p - 1).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}