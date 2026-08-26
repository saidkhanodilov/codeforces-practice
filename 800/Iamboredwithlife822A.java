import java.util.Scanner;
public class Iamboredwithlife822A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = Math.min(a, b);
        long fact = 1;
        for (long i = 2; i <= m; i++) fact *= i;
        System.out.println(fact);
        scanner.close();
    }
}