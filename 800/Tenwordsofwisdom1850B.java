import java.util.Scanner;

public class Tenwordsofwisdom1850B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int bestIndex = -1;
            int maxQuality = -1;

            for (int j = 1; j <= n; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a <= 10) {
                    if (b > maxQuality) {
                        maxQuality = b;
                        bestIndex = j;
                    }
                }
            }

            System.out.println(bestIndex);
        }

        scanner.close();
    }
}