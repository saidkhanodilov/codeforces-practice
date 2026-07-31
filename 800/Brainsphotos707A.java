import java.util.Scanner;

public class Brainsphotos707A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean isColor = false;

        for (int i = 0; i < n * m; i++) {
            char pixel = scanner.next().charAt(0);
            if (pixel == 'C' || pixel == 'M' || pixel == 'Y') {
                isColor = true;
            }
        }

        if (isColor) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }

        scanner.close();
    }
}