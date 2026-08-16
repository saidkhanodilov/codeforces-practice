import java.util.Scanner;

public class Beautifulaverage2162A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int maxVal = 0;

            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                maxVal = Math.max(maxVal, x);
            }

            System.out.println(maxVal);
        }

        scanner.close();
    }
}