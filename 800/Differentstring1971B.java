import java.util.Scanner;

public class Differentstring1971B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            char[] chars = s.toCharArray();

            boolean found = false;
            int swapIndex = -1;

            for (int j = 1; j < chars.length; j++) {
                if (chars[j] != chars[0]) {
                    swapIndex = j;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                char temp = chars[0];
                chars[0] = chars[swapIndex];
                chars[swapIndex] = temp;
                System.out.println(new String(chars));
            }
        }

        scanner.close();
    }
}