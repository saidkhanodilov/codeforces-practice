import java.util.Scanner;
import java.util.HashMap;
public class Wordgame1722C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            String[][] words = new String[3][n];
            HashMap<String, Integer> count = new HashMap<>();
            for (int p = 0; p < 3; p++) {
                for (int i = 0; i < n; i++) {
                    words[p][i] = scanner.next();
                    count.merge(words[p][i], 1, Integer::sum);
                }
            }
            long[] score = new long[3];
            for (int p = 0; p < 3; p++) {
                for (int i = 0; i < n; i++) {
                    int c = count.get(words[p][i]);
                    if (c == 1) score[p] += 3;
                    else if (c == 2) score[p] += 1;
                }
            }
            sb.append(score[0]).append(" ").append(score[1]).append(" ").append(score[2]).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}