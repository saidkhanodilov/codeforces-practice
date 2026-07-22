import java.util.Scanner;

public class Panoramixsprediction80A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int nextPrime = n + 1;
        while (true) {
            boolean prime = true;
            for (int i = 2; i * i <= nextPrime; i++) {
                if (nextPrime % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                break;
            }
            nextPrime++;
        }

        if (nextPrime == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
