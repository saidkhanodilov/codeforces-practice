import java.util.Scanner;

public class Foxandsnake510A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // Process
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= m; c++) {
                if (r % 2 == 1) {
                    System.out.print("#");
                } else {
                    boolean connectRight = (r / 2) % 2 == 1;
                    if (connectRight && c == m) {
                        System.out.print("#");
                    } else if (!connectRight && c == 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}