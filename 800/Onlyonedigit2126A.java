import java.util.Scanner;

public class Onlyonedigit2126A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            boolean[] digits = new boolean[10];

            int temp = x;
            while (temp > 0) {
                digits[temp % 10] = true;
                temp /= 10;
            }
            if (x == 0) {
                digits[0] = true;
            }

            int y = 0;
            while (true) {
                boolean found = false;
                int yTemp = y;
                if (yTemp == 0) {
                    if (digits[0]) {
                        found = true;
                    }
                } else {
                    while (yTemp > 0) {
                        if (digits[yTemp % 10]) {
                            found = true;
                            break;
                        }
                        yTemp /= 10;
                    }
                }

                if (found) {
                    System.out.println(y);
                    break;
                }
                y++;
            }
        }

        scanner.close();
    }
}