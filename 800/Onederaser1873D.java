import java.util.Scanner;

public class Onederaser1873D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();

            int ops = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'B') {
                    ops++;
                    j += k - 1;
                }
            }

            System.out.println(ops);
        }

        scanner.close();
    }
}