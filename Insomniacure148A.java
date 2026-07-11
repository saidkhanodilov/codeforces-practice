import  java.util.Scanner;
public class Insomniacure148A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        // Process
        int count = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0|| i % m == 0 || i % n == 0) {
                count++;
            }
        }
        // Process
        System.out.println(count);
        scanner.close();
    }
}