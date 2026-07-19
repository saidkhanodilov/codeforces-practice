import java.util.Scanner;

public class Dislikeofthrees1560A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();
            int count = 0;
            int x = 0;

            while (count < k) {
                x++;

                if (x % 3 != 0 && x % 10 != 3) {
                    count++;
                }
            }
            System.out.println(x);
        }
    }
}
