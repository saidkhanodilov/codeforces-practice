import java.util.Scanner;

public class Sum1742A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        // Process
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b == c || a + c == b || b + c == a) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        // Output
        System.out.print(sb);
    }
}