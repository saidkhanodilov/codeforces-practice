import java.util.Scanner;

public class Maximumincrease702A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        System.out.println(maxLen);
        scanner.close();
    }
}