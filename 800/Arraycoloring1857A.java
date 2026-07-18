import java.util.Scanner;

public class Arraycoloring1857A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            int sum =0;
            for (int j = 0; j < k; j++) {
                int a = scanner.nextInt();
                sum += a;
            }
            if(sum % 2 == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}