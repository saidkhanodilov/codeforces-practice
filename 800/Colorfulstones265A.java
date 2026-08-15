import java.util.Scanner;

public class Colorfulstones265A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()) {
            return;
        }

        String s = scanner.next();
        String t = scanner.next();

        int pos = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(pos) == t.charAt(i)) {
                pos++;
            }
        }

        System.out.println(pos + 1);

        scanner.close();
    }
}