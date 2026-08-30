import java.util.Scanner;
public class Collatzconjecture2137A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            for (int i = 0; i < k; i++) x *= 2;
            sb.append(x).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}