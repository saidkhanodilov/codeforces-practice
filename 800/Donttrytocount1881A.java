import java.util.Scanner;

public class Donttrytocount1881A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String x = scanner.next();
            String s = scanner.next();

            int ops = 0;
            boolean found = false;

            while (ops <= 5) {
                if (x.contains(s)) {
                    found = true;
                    break;
                }
                x = x + x;
                ops++;
            }

            if (found) {
                System.out.println(ops);
            } else {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}