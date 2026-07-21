import java.util.Scanner;

public class Lovestory1829A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        String text = "codeforces";

        while (t-- > 0) {
            String s = scanner.next();
            int result = 0;
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != text.charAt(i)) {
                    result = result + 1;
                }
            }
            System.out.println(result);

        }
    }
}
