import  java.util.Scanner;
public class Watermelon4A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // statements
        if (input % 2 == 0 && input >= 4) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
