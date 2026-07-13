import java.util.Scanner;

public class Policerecruits427A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int untreatedCrimes = 0;
        int officers        = 0;

        for (int i = 0; i < n; i++) {
            int event = scanner.nextInt();

            if (event > 0) {
                officers += event;
            }
            else if (event == -1) {

                if (officers > 0) {
                    officers--;
                } else {
                    untreatedCrimes++;
                }
            }
        }
        // Output
        System.out.println(untreatedCrimes);
        scanner.close();
    }
}