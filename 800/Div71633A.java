import java.util.*;

public class Div71633A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            String s = String.valueOf(n);
            int len = s.length();
            int lo = (int) Math.pow(10, len - 1);
            int hi = (int) Math.pow(10, len) - 1;

            int bestDiff = Integer.MAX_VALUE;
            int bestNum = -1;
            for (int cand = lo; cand <= hi; cand++) {
                if (cand % 7 != 0) continue;
                String cs = String.valueOf(cand);
                int diff = 0;
                for (int i = 0; i < len; i++) {
                    if (cs.charAt(i) != s.charAt(i)) diff++;
                }
                if (diff < bestDiff) {
                    bestDiff = diff;
                    bestNum = cand;
                }
            }
            sb.append(bestNum).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}