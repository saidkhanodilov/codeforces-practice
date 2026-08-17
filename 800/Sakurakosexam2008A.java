import java.util.Scanner;

public class Sakurakosexam2008A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int totalSum = a + 2 * b;

            if (totalSum % 2 != 0) {
                System.out.println("NO");
            } else {
                int target = totalSum / 2;
                if (target % 2 == 0) {
                    System.out.println("YES");
                } else {
                    if (a >= 2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }

        scanner.close();
    }
}