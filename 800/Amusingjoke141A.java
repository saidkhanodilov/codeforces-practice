import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Amusingjoke141A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String guest = br.readLine().trim();
        String host = br.readLine().trim();
        String pile = br.readLine().trim();

        String combined = guest + host;
        if (combined.length() != pile.length()) {
            System.out.println("NO");
            return;
        }
        char[] c1 = combined.toCharArray();
        char[] c2 = pile.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(Arrays.equals(c1, c2) ? "YES" : "NO");
    }
}