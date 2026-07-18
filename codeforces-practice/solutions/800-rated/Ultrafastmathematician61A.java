import java.util.Scanner;

public class Ultrafastmathematician61A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                result.append('1');
            } else {
                result.append('0');
            }
        }

        System.out.println(result.toString());
        scanner.close();
    }
}