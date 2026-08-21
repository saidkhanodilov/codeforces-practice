import java.util.*;
import java.io.*;

public class Twopermutations1761A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            boolean ok;
            if (a == n || b == n) {
                ok = (a == n && b == n);
            } else {
                ok = (a + b <= n - 2);
            }

            sb.append(ok ? "Yes" : "No").append('\n');
        }

        System.out.print(sb);
    }
}