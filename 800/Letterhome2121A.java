import java.util.Scanner;
public class Letterhome2121A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                if (x < min) min = x;
                if (x > max) max = x;
            }
            if (min > s) min = s;
            if (max < s) max = s;
            long leftFirst = (long)(s - min) + (long)(max - min);
            long rightFirst = (long)(max - s) + (long)(max - min);
            sb.append(Math.min(leftFirst, rightFirst)).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}