import  java.util.Scanner;
import java.lang.Math;
public class Calculationgfunction486A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        // Process
        long output ;
       if (input % 2 == 0){
           output = input/2;
       }
       else {
           output = -(input+1)/2;
       }
        // Output
        System.out.println(output);
    }
}