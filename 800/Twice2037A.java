import java.util.Scanner;
import java.util.HashMap;
public class Twice2037A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            HashMap<Integer, Integer> count = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                count.merge(x, 1, Integer::sum);
            }
            int score = 0;
            for (int c : count.values()) score += c / 2;
            sb.append(score).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}