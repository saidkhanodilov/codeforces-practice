import java.util.Scanner;

public class Stonesonthetable266A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Process
        String input = scanner.next();
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(input.charAt(i) == input.charAt(i+1)){
                count++;
            }
            else {
                continue;
            }
        }
        //Output
        System.out.println(count);
    }
}