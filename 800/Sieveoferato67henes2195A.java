import java.util.Scanner;

public class Sieveoferato67henes2195A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            boolean has67 = false;

            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a == 67) {
                    has67 = true;
                }
            }

            if (has67) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}