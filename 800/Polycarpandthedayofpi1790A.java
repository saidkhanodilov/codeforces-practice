import java.util.Scanner;

public class Polycarpandthedayofpi1790A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();
        String pi = "314159265358979323846264338327";

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == pi.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}