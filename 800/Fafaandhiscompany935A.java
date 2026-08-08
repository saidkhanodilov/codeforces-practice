import java.util.Scanner;

public class Fafaandhiscompany935A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int count = 0;

        for (int l = 1; l < n; l++) {
            if ((n - l) % l == 0) {
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}