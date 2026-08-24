import java.util.Scanner;

public class Whoisopposite1560B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();

            long diff = Math.abs(a - b);
            long total = diff * 2;

            if (a > total || b > total || c > total) {
                System.out.println(-1);
            } else {
                long ans = c + diff;
                if (ans > total) {
                    ans = c - diff;
                }
                System.out.println(ans);
            }
        }

        scanner.close();
    }
}