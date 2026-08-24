import java.util.Scanner;
public class Wheresthebishop1692C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] grid = new String[8];
            int idx = 0;
            while (idx < 8) {
                String line = scanner.nextLine();
                if (line.trim().isEmpty()) continue;
                grid[idx++] = line;
            }
            int ansR = -1, ansC = -1;
            for (int r = 2; r <= 7 && ansR == -1; r++) {
                for (int c = 2; c <= 7; c++) {
                    if (grid[r-2].charAt(c-2) == '#' &&
                            grid[r-2].charAt(c) == '#' &&
                            grid[r].charAt(c-2) == '#' &&
                            grid[r].charAt(c) == '#') {
                        ansR = r; ansC = c;
                        break;
                    }
                }
            }
            sb.append(ansR).append(" ").append(ansC).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}