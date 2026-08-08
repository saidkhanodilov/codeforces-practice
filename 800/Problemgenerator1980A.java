import java.util.Scanner;

public class Problemgenerator1980A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String s = scanner.next();

            int[] counts = new int[7];
            for (int j = 0; j < n; j++) {
                char ch = s.charAt(j);
                counts[ch - 'A']++;
            }

            int needed = 0;
            for (int j = 0; j < 7; j++) {
                if (counts[j] < m) {
                    needed += (m - counts[j]);
                }
            }

            System.out.println(needed);
        }

        scanner.close();
    }
}