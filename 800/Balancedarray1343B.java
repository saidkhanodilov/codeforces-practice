import java.util.Scanner;

public class Balancedarray1343B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            if ((n / 2) % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= n / 2; i++) {
                sb.append(2 * i).append(" ");
            }

            for (int i = 1; i < n / 2; i++) {
                sb.append(2 * i - 1).append(" ");
            }

            int lastOdd = (n - 1) + (n / 2);
            sb.append(lastOdd);

            System.out.println(sb.toString());
        }

        scanner.close();
    }
}