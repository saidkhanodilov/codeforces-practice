import java.util.Scanner;

public class Arrivalofthegeneral144A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            maxVal = Math.max(maxVal, a[i]);
            minVal = Math.min(minVal, a[i]);
        }

        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == maxVal) {
                maxIndex = i;
                break; // first (leftmost) occurrence
            }
        }

        int minIndex = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == minVal) {
                minIndex = i;
                break; // last (rightmost) occurrence
            }
        }

        int swaps = maxIndex + (n - 1 - minIndex);
        if (minIndex < maxIndex) {
            swaps--;
        }

        System.out.println(swaps);
    }
}