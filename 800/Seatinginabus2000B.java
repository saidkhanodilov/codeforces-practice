import java.util.Scanner;

public class Seatinginabus2000B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            boolean[] occupied = new boolean[n + 2];
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                int seat = a[i];
                if (i == 0) {
                    occupied[seat] = true;
                } else {
                    if (occupied[seat - 1] || occupied[seat + 1]) {
                        occupied[seat] = true;
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}