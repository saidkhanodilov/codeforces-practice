import java.util.Scanner;

public class Skibidusandamogu2065A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            String ans = s.substring(0, s.length() - 2) + "i";
            System.out.println(ans);
        }

        scanner.close();
    }
}