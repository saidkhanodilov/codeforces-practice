import java.util.Scanner;

public class Aplusb1772A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t-- > 0) {
            String s = scanner.nextLine();
            int a = s.charAt(0) - '0';
            int b = s.charAt(2) - '0';
            System.out.println(a + b);
        }
        scanner.close();
    }
}