import java.util.Scanner;
public class Blackslexandpassword2179A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            sb.append(k * x + 1).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}