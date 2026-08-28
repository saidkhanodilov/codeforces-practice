import java.util.*;

public class Turtlemathfastthreetask {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int tc = 0; tc < t; tc++) {
                int n = scanner.nextInt();
                long sum = 0;
                int[] cnt = new int[3];
                for (int i = 0; i < n; i++) {
                    int a = scanner.nextInt();
                    sum += a;
                    cnt[a % 3]++;
                }
                int r = (int) (sum % 3);
                if (r == 0) {
                    sb.append(0).append("\n");
                    continue;
                }
                int ans = 3 - r;
                if (cnt[r] >= 1) {
                    ans = Math.min(ans, 1);
                } else {
                    int need = (3 - r) % 3;
                    if (cnt[need] >= 2) {
                        ans = Math.min(ans, 2);
                    }
                }
                ans = Math.min(ans, n);
                sb.append(ans).append("\n");
            }
            System.out.print(sb);
            scanner.close();
        }
    }

