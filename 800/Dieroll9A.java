import java.util.Scanner;

public class Dieroll9A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int max = Math.max(y, w);
        int numerator = 6 - max + 1;

        if (numerator == 1) {
            System.out.println("1/6");
        } else if (numerator == 2) {
            System.out.println("1/3");
        } else if (numerator == 3) {
            System.out.println("1/2");
        } else if (numerator == 4) {
            System.out.println("2/3");
        } else if (numerator == 5) {
            System.out.println("5/6");
        } else if (numerator == 6) {
            System.out.println("1/1");
        } else {
            System.out.println("0/1");
        }

        scanner.close();
    }
}
