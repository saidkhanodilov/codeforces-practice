import java.util.Scanner;

public class Bachgoldproblem749A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int k = n / 2;

        System.out.println(k);

        for (int i = 0; i < k - 1; i++) {
            System.out.print("2 ");
        }

        if (n % 2 == 0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        scanner.close();
    }
}