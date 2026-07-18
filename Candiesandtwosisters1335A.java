import java.util.Scanner;
public class Candiesandtwosisters1335A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt();
        int[] output = new int[t];
        for(int i = 0; i < t; i++){
           int n  = scanner.nextInt();
           output[i] = (n-1)/2;
        }
        for(int i = 0; i < t; i++){
            System.out.println(output[i]);
        }
    }
}