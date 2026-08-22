import java.util.Scanner;

public class Socialexperiment2184A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            if (n == 2) {
                System.out.println(2);
            } else if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

        scanner.close();
    }
}