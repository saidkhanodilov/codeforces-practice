import java.util.Scanner;

public class Homework2132A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String a = scanner.next();
            int m = scanner.nextInt();
            String b = scanner.next();
            String c = scanner.next();

            StringBuilder prefix = new StringBuilder();
            StringBuilder suffix = new StringBuilder();

            for (int j = 0; j < m; j++) {
                char ch = b.charAt(j);
                char who = c.charAt(j);

                if (who == 'V') {
                    prefix.insert(0, ch);
                } else {
                    suffix.append(ch);
                }
            }

            System.out.println(prefix.toString() + a + suffix.toString());
        }

        scanner.close();
    }
}