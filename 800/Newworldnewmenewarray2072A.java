import java.util.*;
import java.io.*;

public class Newworldnewmenewarray2072A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            int absK = Math.abs(k);
            int ans;

            if (absK == 0) {
                ans = 0;
            } else {
                int m = (absK + p - 1) / p;
                ans = (m <= n) ? m : -1;
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}