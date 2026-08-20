import java.util.*;
import java.io.*;

public class Quintomania2036A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            boolean ok = true;
            for (int i = 1; i < n; i++) {
                int d = Math.abs(a[i] - a[i - 1]);
                if (d != 5 && d != 7) {
                    ok = false;
                    break;
                }
            }

            sb.append(ok ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}

