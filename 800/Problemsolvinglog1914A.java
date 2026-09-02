import java.util.*;

public class Problemsolvinglog1914A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] time = new int[26];
            for (char c : s.toCharArray()) {
                time[c - 'A']++;
            }
            int solved = 0;
            for (int i = 0; i < 26; i++) {
                if (time[i] >= i + 1) solved++;
            }
            System.out.println(solved);
        }
    }
}