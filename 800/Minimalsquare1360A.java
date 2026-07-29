import java.util.Scanner;

public class Minimalsquare1360A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int side = Math.max(Math.max(a, b), Math.min(a, b) * 2);
            System.out.println(side * side);
        }

        scanner.close();
    }
}