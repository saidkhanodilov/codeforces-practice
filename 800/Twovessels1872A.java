import java.util.Scanner;

public class Twovessels1872A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double diff = Math.abs(a - b);
            double movedPerStep = 2.0 * c;

            long ans = (long) Math.ceil(diff / movedPerStep);

            System.out.println(ans);
        }

        scanner.close();
    }
}