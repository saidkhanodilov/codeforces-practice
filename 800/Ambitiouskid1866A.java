import java.util.Scanner;

public class Ambitiouskid1866A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int minOps = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int ops = Math.abs(a);
            if (ops < minOps) {
                minOps = ops;
            }
        }

        System.out.println(minOps);
        scanner.close();
    }
}