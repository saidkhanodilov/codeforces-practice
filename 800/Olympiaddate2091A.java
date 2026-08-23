import java.util.Scanner;
public class Olympiaddate2091A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] need = new int[10];
        int[] dateDigits = {0,1,0,3,2,0,2,5};
        for (int d : dateDigits) need[d]++;
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
            int[] count = new int[10];
            int ans = 0;
            for (int j = 0; j < n; j++) {
                count[a[j]]++;
                boolean ok = true;
                for (int d = 0; d < 10; d++) {
                    if (count[d] < need[d]) { ok = false; break; }
                }
                if (ok) { ans = j + 1; break; }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}