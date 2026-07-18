import java.util.Scanner;
public class Dominopilling50A{
    public static void main(String[] args){
       // Take input
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
       // Process
        int s = m*n;
        int d = 2;
        int output = s/d;
       // Output
        System.out.println(output);
    }
}

