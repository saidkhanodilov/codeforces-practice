import java.util.Scanner;

public class Yetanothertwointegersproblem1409A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long diff = Math.abs(a - b);
            long moves = (diff / 10) + (diff % 10 == 0 ? 0 : 1);

            System.out.println(moves);
        }
    }
}