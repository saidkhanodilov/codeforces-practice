import java.util.Scanner;

public class Normalproblem2044B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String a = scanner.next();
            StringBuilder b = new StringBuilder();

            for (int j = a.length() - 1; j >= 0; j--) {
                char ch = a.charAt(j);
                if (ch == 'p') {
                    b.append('q');
                } else if (ch == 'q') {
                    b.append('p');
                } else {
                    b.append('w');
                }
            }

            System.out.println(b.toString());
        }

        scanner.close();
    }
}