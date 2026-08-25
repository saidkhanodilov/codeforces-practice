import java.util.Arrays;
import java.util.Scanner;

public class Sashaandarraycoloring1843A {
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

            Arrays.sort(a);

            int totalCost = 0;
            int left = 0;
            int right = n - 1;

            while (left < right) {
                totalCost += (a[right] - a[left]);
                left++;
                right--;
            }

            System.out.println(totalCost);
        }

        scanner.close();
    }
}