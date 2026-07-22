import java.util.Scanner;

public class Buttons1858A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (c % 2 == 1) {
                if (a >= b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else {
                if (a > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
        scanner.close();
    }
}