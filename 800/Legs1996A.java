import java.util.Scanner;

public class Legs1996A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int ans = n / 4;
            if (n % 4 != 0) {
                ans++;
            }
            System.out.println(ans);
        }

        scanner.close();
    }
}