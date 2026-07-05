import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Boyorgirl236A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        // Process
        Set<Character> uniqueChars = new HashSet<>();
        for(int i = 0; i < userName.length(); i++){
            uniqueChars.add(userName.charAt(i));
        }
        //Output
        if (uniqueChars.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else {
            System.out.println("IGNORE HIM!");
        }
    }
}