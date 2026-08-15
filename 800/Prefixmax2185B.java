import java.util.Scanner;

public class Prefixmax2185B {
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

            long maxVal = -1;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    long currentSum = 0;
                    long currentMax = 0;
                    for (int k = 0; k < n; k++) {
                        currentMax = Math.max(currentMax, a[k]);
                        currentSum += currentMax;
                    }

                    maxVal = Math.max(maxVal, currentSum);

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            System.out.println(maxVal);
        }

        scanner.close();
    }
}