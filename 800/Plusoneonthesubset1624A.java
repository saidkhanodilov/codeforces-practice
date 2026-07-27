import java.util.Scanner;

public class Plusoneonthesubset1624A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;

            for (int j = 0; j < n; j++) {
                int val = scanner.nextInt();
                if (val < minVal) {
                    minVal = val;
                }
                if (val > maxVal) {
                    maxVal = val;
                }
            }

            out.append((maxVal - minVal)).append("\n");
        }

        System.out.print(out);
        scanner.close();
    }
}