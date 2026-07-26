import java.util.Scanner;

public class Minutesbeforthenewyear1283A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int minutesSinceMidnight = h * 60 + m;
            int minutesLeft = 24 * 60 - minutesSinceMidnight;
            System.out.println(minutesLeft);
        }
        scanner.close();
    }
}