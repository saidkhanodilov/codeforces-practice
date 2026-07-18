import java.util.Scanner;
import java.lang.Math;
public class Elephant617A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        // Process
        int steps = x / 5;
        if (x % 5 != 0) {
            steps = steps + 1;
        }
        // Output
        System.out.println(steps);
        }
    }
