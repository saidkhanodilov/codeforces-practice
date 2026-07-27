import java.util.Scanner;

public class Myfirstsortingproblem1971A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < y) {
                out.append(x).append(" ").append(y).append("\n");
            } else {
                out.append(y).append(" ").append(x).append("\n");
            }
        }

        System.out.print(out);
        scanner.close();
    }
}