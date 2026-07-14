import java.util.Scanner;

public class Iloveusername155A {
    public static void main(String args[]) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Process
        int minValue = 0;
        int maxValue = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int input =  scanner.nextInt();
            if (input > maxValue) {
                maxValue = input;
                count++;
            }
            else if (input < minValue) {
                minValue = input;
                count++;
            }

        }
        // Output
        System.out.println(count);
        scanner.close();
    }
}