import java.util.Scanner;
public class Xorwice1421A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            sb.append(a ^ b).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}