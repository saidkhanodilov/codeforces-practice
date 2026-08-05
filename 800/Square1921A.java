import java.util.Scanner;

public class Square1921A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();

            int side = 0;
            for (int j = 0; j < 3; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (x == x1) {
                    side = Math.abs(y - y1);
                } else if (y == y1) {
                    side = Math.abs(x - x1);
                }
            }

            System.out.println(side * side);
        }

        scanner.close();
    }
}