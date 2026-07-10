import java.util.Scanner;

public class Hulk705A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Prcoess
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("I hate");
            } else {
                sb.append("I love");
            }
            if (i == n) {
                sb.append(" it");
            } else {
                sb.append(" that ");
            }
        }
        // Output
        System.out.println(sb.toString());
    }
}