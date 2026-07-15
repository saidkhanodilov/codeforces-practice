import java.util.Scanner;

public class Buyashovel732A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int r = scanner.nextInt();

        // Process
        int count = 1;
        while (true) {
            int totalCost = count * k;

            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                break;
            }

            count++;
        }
        // Output
        System.out.println(count);
        scanner.close();
    }
}