import java.util.Scanner;

public class Followingdirections1791B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int x = 0;
            int y = 0;
            boolean passed = false;

            for (int j = 0; j < n; j++) {
                char move = s.charAt(j);
                if (move == 'L') {
                    x--;
                } else if (move == 'R') {
                    x++;
                } else if (move == 'U') {
                    y++;
                } else if (move == 'D') {
                    y--;
                }

                if (x == 1 && y == 1) {
                    passed = true;
                    break;
                }
            }

            if (passed) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}