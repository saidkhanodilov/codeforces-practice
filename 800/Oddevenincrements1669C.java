import java.util.Scanner;

public class Oddevenincrements1669C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            boolean oddParityEvenIndices = a[0] % 2 != 0;
            boolean oddParityOddIndices = a[1] % 2 != 0;

            boolean possible = true;

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    if ((a[j] % 2 != 0) != oddParityEvenIndices) {
                        possible = false;
                        break;
                    }
                } else {
                    if ((a[j] % 2 != 0) != oddParityOddIndices) {
                        possible = false;
                        break;
                    }
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}