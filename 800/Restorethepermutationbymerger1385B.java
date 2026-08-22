import java.util.Scanner;
import java.util.HashSet;
public class Restorethepermutationbymerger1385B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[2 * n];
            for (int j = 0; j < 2 * n; j++) a[j] = scanner.nextInt();
            HashSet<Integer> seen = new HashSet<>();
            for (int j = 0; j < 2 * n; j++) {
                if (!seen.contains(a[j])) {
                    seen.add(a[j]);
                    sb.append(a[j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}