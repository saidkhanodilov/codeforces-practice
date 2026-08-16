import java.util.Scanner;

public class Casimirsstringsolitaire1579A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int countA = 0;
            int countB = 0;
            int countC = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'A') {
                    countA++;
                } else if (c == 'B') {
                    countB++;
                } else if (c == 'C') {
                    countC++;
                }
            }

            if (countB == countA + countC) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}