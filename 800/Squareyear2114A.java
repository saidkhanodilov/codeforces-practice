import java.util.Scanner;

public class Squareyear2114A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int target = Integer.parseInt(s);

            boolean found = false;

            for (int len = 1; len <= 3; len++) {
                int a = Integer.parseInt(s.substring(0, len));
                int b = Integer.parseInt(s.substring(len));

                if ((a + b) * (a + b) == target) {
                    System.out.println(a + " " + b);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(-1);
            }
        }

        scanner.close();
    }
}