import  java.util.Scanner;
public class Wordcapitalization281A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        // Process
        String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
        // Output
        System.out.println(capitalized);
    }
}
