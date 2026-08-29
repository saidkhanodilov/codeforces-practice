import java.util.Scanner;
public class Servalandmochasarray1789A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
            boolean found = false;
            for (int i = 0; i < n && !found; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(a[i], a[j]) <= 2) { found = true; break; }
                }
            }
            sb.append(found ? "Yes" : "No").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}