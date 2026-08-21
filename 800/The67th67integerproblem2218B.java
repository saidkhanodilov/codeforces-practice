import java.util.Scanner;

public class The67th67integerproblem2218B  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long totalSum = 0;
            long minElem = Long.MAX_VALUE;
            long maxElem = Long.MIN_VALUE;

            int n = 7;
            long[] a = new long[n];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextLong();
                totalSum += a[j];
                minElem = Math.min(minElem, a[j]);
                maxElem = Math.max(maxElem, a[j]);
            }

            // We need to negate 6 out of 7 integers.
            // Let the one integer we do NOT negate be x.
            // Then the sum of the array after negating the other 6 will be:
            // x - (totalSum - x) = 2 * x - totalSum.
            // To maximize this expression, we should choose x to be the maximum element in the array.

            long maxSum = 2 * maxElem - totalSum;
            System.out.println(maxSum);
        }

        scanner.close();
    }
}