import java.util.Scanner;
public class Foodforanimals1675A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long needDog = Math.max(0, x - a);
            long needCat = Math.max(0, y - b);
            boolean ok = (needDog + needCat) <= c;
            sb.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}