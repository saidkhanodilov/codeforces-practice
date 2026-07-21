import java.util.Scanner;

public class Choosingteams432A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int y = scanner.nextInt();
            if (y + k <= 5) {
                count++;
            }
        }

        System.out.println(count / 3);
        scanner.close();
    }
}