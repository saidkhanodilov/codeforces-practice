import java.util.Scanner;

public class Notquitelatinsquare1915B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            char missing = ' ';
            for (int r = 0; r < 3; r++) {
                String row = scanner.next();
                if (row.contains("?")) {
                    boolean hasA = row.indexOf('A') != -1;
                    boolean hasB = row.indexOf('B') != -1;
                    boolean hasC = row.indexOf('C') != -1;

                    if (!hasA) missing = 'A';
                    else if (!hasB) missing = 'B';
                    else if (!hasC) missing = 'C';
                }
            }
            System.out.println(missing);
        }

        scanner.close();
    }
}