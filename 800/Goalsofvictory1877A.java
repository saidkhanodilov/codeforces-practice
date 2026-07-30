import java.util.Scanner;

public class Goalsofvictory1877A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int sum = 0;

            for (int j = 0; j < n - 1; j++) {
                sum += scanner.nextInt();
            }

            System.out.println(-sum);
        }

        scanner.close();
    }
}