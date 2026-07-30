import java.util.Scanner;

public class Colourblindness1722B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s1 = scanner.next();
            String s2 = scanner.next();

            s1 = s1.replace('G', 'B');
            s2 = s2.replace('G', 'B');

            if (s1.equals(s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}