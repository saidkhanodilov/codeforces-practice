import java.util.Scanner;
import java.util.Arrays;

public class Spellcheck1722A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            if (n != 5) {
                System.out.println("NO");
                continue;
            }

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (sortedStr.equals("Timru")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}