import java.util.Scanner;

public class Vladandthebestoffive1926A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int countA = 0;
            int countB = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    countA++;
                } else {
                    countB++;
                }
            }

            if (countA > countB) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
        scanner.close();
    }
}