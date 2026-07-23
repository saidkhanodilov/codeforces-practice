import java.util.Scanner;

public class Mishkaandgame703A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int mishkaWins = 0;
        int chrisWins = 0;

        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int c = scanner.nextInt();

            if (m > c) {
                mishkaWins++;
            } else if (c > m) {
                chrisWins++;
            }
        }

        if (mishkaWins > chrisWins) {
            System.out.println("Mishka");
        } else if (chrisWins > mishkaWins) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }

        scanner.close();
    }
}