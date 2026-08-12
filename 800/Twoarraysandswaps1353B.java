import java.util.Arrays;
import java.util.Scanner;

public class   Twoarraysandswaps1353B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int leftA = 0;
            int rightB = n - 1;

            for (int j = 0; j < k; j++) {
                if (leftA < n && rightB >= 0 && b[rightB] > a[leftA]) {
                    a[leftA] = b[rightB];
                    leftA++;
                    rightB--;
                } else {
                    break;
                }
            }

            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a[j];
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}