import java.util.*;
import java.io.*;

public class Stonegame1538A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            int minIdx = 0, maxIdx = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if (a[i] < a[minIdx]) minIdx = i;
                if (a[i] > a[maxIdx]) maxIdx = i;
            }

            int lo = Math.min(minIdx, maxIdx);
            int hi = Math.max(minIdx, maxIdx);

            int fromLeft = hi + 1;
            int fromRight = n - lo;
            int both = (lo + 1) + (n - hi);

            int ans = Math.min(fromLeft, Math.min(fromRight, both));
            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}
