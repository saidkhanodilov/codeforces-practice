import java.util.Scanner;

public class Shortsubstrings1367A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String b = scanner.next();
            StringBuilder a = new StringBuilder();

            a.append(b.charAt(0));
            for (int i = 1; i < b.length(); i += 2) {
                a.append(b.charAt(i));
            }

            System.out.println(a.toString());
        }
        scanner.close();
    }
}