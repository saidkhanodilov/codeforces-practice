import java.util.Scanner;

public class Atillasfavoriteproblem1760B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            char maxChar = 'a';
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) > maxChar) {
                    maxChar = s.charAt(j);
                }
            }

            int alphabetSize = maxChar - 'a' + 1;
            System.out.println(alphabetSize);
        }

        scanner.close();
    }
}