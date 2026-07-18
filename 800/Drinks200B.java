import java.util.Scanner;
public class Drinks200B {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Process
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        double result = (double) sum / n;
        // Output
        System.out.printf("%.12f%n", result);
        scanner.close();
    }
}