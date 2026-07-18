import java.util.Scanner;

public class Hitthelottery996A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        // Process
        int[] denominations = {100, 20, 10, 5, 1};
        long count = 0;

        for (int d : denominations) {// shortcut
            count += n / d;
            n %= d;
        }
        // Output
        System.out.println(count);
    }
}