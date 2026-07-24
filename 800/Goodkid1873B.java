import java.util.Arrays;
import java.util.Scanner;

public class Goodkid1873B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);
            arr[0]++;

            long product = 1;
            for (int i = 0; i < n; i++) {
                product *= arr[i];
            }
            System.out.println(product);
        }
        scanner.close();
    }
}