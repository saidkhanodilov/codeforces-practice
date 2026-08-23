import java.util.Scanner;
public class Lever2131A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
            for (int j = 0; j < n; j++) b[j] = scanner.nextInt();
            long sum = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] > b[j]) sum += a[j] - b[j];
            }
            sb.append(sum + 1).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}