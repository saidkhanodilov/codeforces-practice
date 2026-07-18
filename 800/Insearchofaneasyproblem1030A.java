import java.util.Scanner;
import java.util.Stack;
public class Insearchofaneasyproblem1030A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int outCome = 0;
        for(int i = 0; i < numberOfPeople; i++){
            int input  = scanner.nextInt();
            if(input == 1){
                outCome++;
            }
        }
        if (outCome > 0){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}