import java.util.Scanner;
import java.util.HashSet;

public class Icpcbaloons1703B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            HashSet<Character> solved = new HashSet<>();
            int balloons = 0;

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (!solved.contains(c)) {
                    solved.add(c);
                    balloons += 2;
                } else {
                    balloons += 1;
                }
            }

            System.out.println(balloons);
        }
        scanner.close();
    }
}