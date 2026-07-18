import java.util.*;

public class Antonandletters443A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        HashSet<Character> letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        System.out.println(letters.size());
    }
}