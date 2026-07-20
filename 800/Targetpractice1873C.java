import java.util.Scanner;

public class Targetpractice1873C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int totalScore = 0;

            for (int r = 0; r < 10; r++) {
                String line = scanner.next();
                for (int c = 0; c < 10; c++) {
                    if (line.charAt(c) == 'X') {
                        int layer = Math.min(Math.min(r, c), Math.min(9 - r, 9 - c));
                        totalScore += (layer + 1);
                    }
                }
            }
            System.out.println(totalScore);
        }
    }
}