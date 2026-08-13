import java.util.Scanner;

public class Freeicecream686A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        long x = scanner.nextLong();

        long distressed = 0;

        for (int i = 0; i < n; i++) {
            char type = scanner.next().charAt(0);
            long d = scanner.nextLong();

            if (type == '+') {
                x += d;
            } else {
                if (x >= d) {
                    x -= d;
                } else {
                    distressed++;
                }
            }
        }

        System.out.println(x + " " + distressed);
        scanner.close();
    }
}