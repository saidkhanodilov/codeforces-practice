import java.util.Scanner;

public class Donotbedistracted1520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean suspicious = false;
            boolean[] seen = new boolean[26];

            seen[s.charAt(0) - 'A'] = true;
            for (int i = 1; i < n; i++) {
                char curr = s.charAt(i);
                char prev = s.charAt(i - 1);
                if (curr != prev) {
                    if (seen[curr - 'A']) {
                        suspicious = true;
                        break;
                    }
                    seen[curr - 'A'] = true;
                }
            }

            if (suspicious) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}