import java.io.*;
import java.util.*;

public class Bepositive2149A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int zeros = 0, negs = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 0) zeros++;
                else if (x == -1) negs++;
            }
            int ans = zeros + (negs % 2 == 1 ? 2 : 0);
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}