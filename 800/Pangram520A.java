import java.util.Scanner;

public class Pangram520A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        // Process
        boolean[] seen = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            seen[c - 'a'] = true;
        }

        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!seen[i]) {
                isPangram = false;
                break;
            }
        }
        // Output
        System.out.println(isPangram ? "YES" : "NO");
    }
}