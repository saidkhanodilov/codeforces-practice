import java.util.*;
import java.io.*;

public class Linearkeyboard1607A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String kb = br.readLine().trim();
            String s = br.readLine().trim();

            int[] pos = new int[26];
            for (int i = 0; i < 26; i++) pos[kb.charAt(i) - 'a'] = i;

            long time = 0;
            for (int i = 1; i < s.length(); i++) {
                time += Math.abs(pos[s.charAt(i) - 'a'] - pos[s.charAt(i - 1) - 'a']);
            }

            sb.append(time).append('\n');
        }

        System.out.print(sb);
    }
}