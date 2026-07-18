import java.util.Scanner;

public class Presents136A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n + 1];
        int[] answer = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            p[i] = scanner.nextInt();
            answer[p[i]] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(answer[i]);
            if (i < n) sb.append(' ');
        }
        System.out.println(sb.toString());

        scanner.close();
    }
}