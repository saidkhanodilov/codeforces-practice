import java.util.Scanner;

public class Blacksquare431A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();

        String s = scanner.next();
        int totalCalories = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                totalCalories += a1;
            } else if (c == '2') {
                totalCalories += a2;
            } else if (c == '3') {
                totalCalories += a3;
            } else if (c == '4') {
                totalCalories += a4;
            }
        }

        System.out.println(totalCalories);
        scanner.close();
    }
}