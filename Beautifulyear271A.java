import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Beautifulyear271A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        // Process
        int candidate = y + 1;
        while (true) {
            String s = String.valueOf(candidate);
            Set<Character> digits = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                digits.add(s.charAt(i));
            }
            if (digits.size() == s.length()) {
                System.out.println(candidate);
                break;
            }
            candidate++;
        }
    }
}