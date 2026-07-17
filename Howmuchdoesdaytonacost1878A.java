import java.util.Scanner;

public class Howmuchdoesdaytonacost1878A {
    public static void main(String[] args) {
        // Take input
        Scanner scannr = new Scanner(System.in);
        int n = scannr.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scannr.nextInt();
            int b = scannr.nextInt();
            int count=0;

            for (int j = 1; j <= a; j++) {
                int c = scannr.nextInt();
                if(c == b){
                   count++;
                }
            }
            // Output
            if(count > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}