import java.util.Scanner;
public class Soldierandbananas546A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int paymentForFirst = scanner.nextInt();
        int hasAmount = scanner.nextInt();
        int wantAmount = scanner.nextInt();
        int totalCost=0;
        // Process
        for (int i = 1; i <= wantAmount; i++) {
            totalCost += paymentForFirst*i;
        }
        if(totalCost > hasAmount){
            System.out.println(totalCost - hasAmount);
        }
        else {
            System.out.println(0);
        }
    }
}