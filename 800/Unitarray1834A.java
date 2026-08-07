import java.util.Scanner;

public class Unitarray1834A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int negCount = 0;
            int posCount = 0;

            for (int j = 0; j < n; j++) {
                int a = scanner.nextInt();
                if (a == -1) {
                    negCount++;
                } else {
                    posCount++;
                }
            }

            int ops = 0;

            while (negCount > posCount || negCount % 2 != 0) {
                negCount--;
                posCount++;
                ops++;
            }

            System.out.println(ops);
        }

        scanner.close();
    }
}