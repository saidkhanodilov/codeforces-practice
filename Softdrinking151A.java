import java.util.*;
import java.lang.Math;
public class Softdrinking151A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        // Process
        int toastDrink = (k*l)/nl;
        int  toastLime = c*d;
        int toastSalt = p / np;
        int finalOutput = (Math.min((Math.min(toastDrink, toastLime)), toastSalt)/n);

        // Output
        System.out.println(finalOutput);
        scanner.close();
    }
}