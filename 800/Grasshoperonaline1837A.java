import java.util.Scanner;

public class Grasshoperonaline1837A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int k = scanner.nextInt();

            if (x % k != 0) {
                System.out.println(1);
                System.out.println(x);
            } else {
                System.out.println(2);
                System.out.println((x - 1) + " 1");
            }
        }

        scanner.close();
    }
}