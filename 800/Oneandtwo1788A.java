import java.util.Scanner;

public class Oneandtwo1788A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int totalTwos = 0;

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
                if (a[j] == 2) {
                    totalTwos++;
                }
            }

            if (totalTwos % 2 != 0) {
                System.out.println(-1);
            } else if (totalTwos == 0) {
                System.out.println(1);
            } else {
                int target = totalTwos / 2;
                int currentTwos = 0;
                int ans = -1;

                for (int j = 0; j < n; j++) {
                    if (a[j] == 2) {
                        currentTwos++;
                    }
                    if (currentTwos == target) {
                        ans = j + 1;
                        break;
                    }
                }

                System.out.println(ans);
            }
        }

        scanner.close();
    }
}