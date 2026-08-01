import java.util.Scanner;

public class Wordonthepaper1850C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            StringBuilder word = new StringBuilder();

            for (int r = 0; r < 8; r++) {
                String row = scanner.next();
                for (int c = 0; c < 8; c++) {
                    char ch = row.charAt(c);
                    if (ch != '.') {
                        word.append(ch);
                    }
                }
            }

            System.out.println(word.toString());
        }

        scanner.close();
    }
}