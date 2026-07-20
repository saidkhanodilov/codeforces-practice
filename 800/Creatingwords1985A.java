import java.util.Scanner;

public class Creatingwords1985A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt();
        while (t-- > 0) {
            String firstWord = scanner.next();
            String secondWord = scanner.next();
           char firstLet1 =  firstWord.charAt(0);
           char firstLet2 = secondWord.charAt(0);

           String rest1 = firstWord.substring(1);
           String rest2 = secondWord.substring(1);

           String newWord1 = firstLet2 +  rest1;
           String newWord2 =  firstLet1 +  rest2;
           System.out.println(newWord1 + " " + newWord2);

        }
        scanner.close();
    }
}