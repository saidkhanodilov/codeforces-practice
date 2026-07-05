import java.util.Scanner;

public class Helpfulmaths339A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Process
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+') {
                continue;
            }
            int value = c - '0';
            if (value == 1) {
                count1 = count1 + 1;
            }
            if (value == 2) {
                count2 = count2 + 1;
            }
            if (value == 3) {
                count3 = count3 + 1;
            }
        }

        // Output — rebuild the string in sorted order
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count1; i++) {
            if (sb.length() > 0) {
                sb.append("+");
            }
            sb.append("1");
        }
        for (int i = 0; i < count2; i++) {
            if (sb.length() > 0) {
                sb.append("+");
            }
            sb.append("2");
        }
        for (int i = 0; i < count3; i++) {
            if (sb.length() > 0) {
                sb.append("+");
            }
            sb.append("3");
        }

        System.out.println(sb.toString());
    }
}