import java.util.Scanner;

public class Vasyathehipster581A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Process
        int differentDays = Math.min(a, b);
        int sameDays = (Math.max(a, b) - differentDays) / 2;
        // Output
        System.out.println(differentDays + " " + sameDays);
        scanner.close();
    }
}