import java.util.Scanner;
import java.lang.Math;
public class Bearandbigbrother791A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int limakInt = scanner.nextInt();
        int bobInt = scanner.nextInt();
        // Process
        int i = 0;
        for (i = 0; bobInt >= limakInt; i++) {
            limakInt = (limakInt*3);
            bobInt = (bobInt*2);
        }
        System.out.println(i);

    }
}