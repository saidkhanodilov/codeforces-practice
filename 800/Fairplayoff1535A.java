import java.util.Scanner;

public class Fairplayoff1535A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();
            int s3 = scanner.nextInt();
            int s4 = scanner.nextInt();

            int max1 = Math.max(s1, s2);
            int min1 = Math.min(s1, s2);
            int max2 = Math.max(s3, s4);
            int min2 = Math.min(s3, s4);

            if (max1 > min2 && max2 > min1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}