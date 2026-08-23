import java.util.Scanner;
public class Olympiaddate2091A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] target = {0,1,0,3,2,0,2,5};
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) a[j] = scanner.nextInt();
            int idx = 0;
            int ans = 0;
            for (int j = 0; j < n && idx < target.length; j++) {
                if (a[j] == target[idx]) {
                    idx++;
                    if (idx == target.length) {
                        ans = j + 1;
                    }
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}