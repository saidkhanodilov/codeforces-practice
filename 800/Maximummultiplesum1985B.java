import java.util.Scanner;

public class Maximummultiplesum1985B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n == 3) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }

        scanner.close();
    }
}