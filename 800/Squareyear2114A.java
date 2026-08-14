import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Squareyear2114A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            int found = -1;
            for (int k = 0; k * k <= n; k++) {
                if (k * k == n) {
                    found = k;
                    break;
                }
            }
            sb.append(found == -1 ? "-1" : "0 " + found).append('\n');
        }
        System.out.print(sb);
    }
}