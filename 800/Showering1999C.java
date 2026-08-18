import java.util.Scanner;

public class Showering1999C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            long s = scanner.nextLong();
            long m = scanner.nextLong();

            long lastEnd = 0;
            boolean canShower = false;

            for (int i = 0; i < n; i++) {
                long l = scanner.nextLong();
                long r = scanner.nextLong();

                if (l - lastEnd >= s) {
                    canShower = true;
                }
                lastEnd = r;
            }

            if (m - lastEnd >= s) {
                canShower = true;
            }

            if (canShower) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}