import java.util.Scanner;

public class The67thintegerproblem2218A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            System.out.println(x);
        }

        scanner.close();
    }
}