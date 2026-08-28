import java.util.Scanner;
public class Longestgoodarray2008C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long d = r - l;
            long k = 1;
            while (k * (k + 1) / 2 <= d) k++;
            sb.append(k).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}