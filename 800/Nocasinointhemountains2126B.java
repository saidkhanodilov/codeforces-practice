
import java.util.Scanner;

public class Nocasinointhemountains2126B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int hikes = 0;
            int i = 0;

            while (i <= n - k) {
                boolean possible = true;
                for (int j = 0; j < k; j++) {
                    if (a[i + j] == 1) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    hikes++;
                    i += k + 1;
                } else {
                    i++;
                }
            }

            System.out.println(hikes);
        }

        scanner.close();
    }
}