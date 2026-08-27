import java.util.Scanner;
import java.util.Arrays;
public class Isamatdinandhismagicwand2167C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            boolean hasEven = false, hasOdd = false;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                if (a[i] % 2 == 0) hasEven = true; else hasOdd = true;
            }
            if (hasEven && hasOdd) {
                Arrays.sort(a);
            }
            for (int i = 0; i < n; i++) {
                sb.append(a[i]);
                sb.append(i == n - 1 ? "\n" : " ");
            }
        }
        System.out.print(sb);
        scanner.close();
    }
}