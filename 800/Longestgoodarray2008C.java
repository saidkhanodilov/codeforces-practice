import java.util.Scanner;
public class Longestgoodarray2008C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long d = r - l;
            long lo = 0, hi = 100000;
            while (lo < hi) {
                long mid = (lo + hi + 1) / 2;
                if (mid * (mid + 1) / 2 <= d) {
                    lo = mid;
                } else {
                    hi = mid - 1;
                }
            }
            sb.append(lo + 1).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}