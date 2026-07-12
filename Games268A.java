import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Games268A {
    public static void main(String[] args) throws Exception {
        // Take input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] h = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h[i] = Integer.parseInt(st.nextToken());
            a[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && h[i] == a[j]) {
                    count++;
                }
            }
        }
        // Output
        System.out.println(count);
    }
}