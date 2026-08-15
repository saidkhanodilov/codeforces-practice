import java.util.Scanner;

public class Skibidusandohio2065B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();

            boolean hasAdjacent = false;
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    hasAdjacent = true;
                    break;
                }
            }

            if (hasAdjacent) {
                System.out.println(1);
            } else {
                System.out.println(s.length());
            }
        }

        scanner.close();
    }
}