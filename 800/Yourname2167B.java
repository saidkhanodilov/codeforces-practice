import java.util.Arrays;
import java.util.Scanner;

public class Yourname2167B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String t = scanner.next();

            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();

            Arrays.sort(sArr);
            Arrays.sort(tArr);

            if (Arrays.equals(sArr, tArr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}