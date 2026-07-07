import java.util.Scanner;
public class Nearlyluckynumber110A {
    public static void main(String[] args){
        // Take input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        // Process
        int j = 0;
        for(int i = 0; i < input.length(); i++){
            char inputChar = input.charAt(i);
            int inputAsInt = inputChar - '0';
           if(inputAsInt == 7 || inputAsInt == 4){
               j++;
           }
           else {
               continue;
           }
        }
        // Output
        if(j == 4 || j == 7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}