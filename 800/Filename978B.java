import java.util.Scanner;

public class Filename978B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        String s = scanner.next();

        int removeCount = 0;
        int consecutiveX = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'x') {
                consecutiveX++;
                if (consecutiveX >= 3) {
                    removeCount++;
                }
            } else {
                consecutiveX = 0;
            }
        }

        System.out.println(removeCount);

        scanner.close();
    }
}
