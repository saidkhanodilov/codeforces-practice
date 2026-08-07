import java.util.Arrays;
import java.util.Scanner;

public class Xaxis1986A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int[] x = new int[3];
            x[0] = scanner.nextInt();
            x[1] = scanner.nextInt();
            x[2] = scanner.nextInt();

            Arrays.sort(x);

            int ans = (x[2] - x[1]) + (x[1] - x[0]);
            System.out.println(ans);
        }

        scanner.close();
    }
}