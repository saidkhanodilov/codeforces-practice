import java.util.Scanner;

public class Equalcandies1676B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                sum += a;
                if (a < min) min = a;
            }
            long answer = sum - (long) n * min;
            System.out.println(answer);
        }
        scanner.close();
    }
}