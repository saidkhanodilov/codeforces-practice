import java.util.Scanner;

public class Sublimesequence2148A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            if(n%2==0){
                System.out.println(0);
            }
            else{
                System.out.println(x);
            }
        }
        scanner.close();
    }
}
