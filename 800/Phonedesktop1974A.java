import java.util.Scanner;

public class Phonedesktop1974A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Each screen has a size of 5 x 3 = 15 cells.
            // Each 2x2 icon takes 4 cells.
            // In one 5x3 screen, we can place at most two 2x2 icons:
            // For example, two 2x2 icons take 2 * 4 = 8 cells, leaving 15 - 8 = 7 cells.
            // Can we place three 2x2 icons? Three 2x2 icons take 3 * 4 = 12 cells, but a 5x3 grid
            // cannot fit three 2x2 icons because their widths/heights (each taking 2 cells in both dimensions)
            // won't allow three non-overlapping squares of 2x2 (since 3 * 2 = 6 width > 3, or 3 * 2 = 6 height > 5).
            // Thus, each screen can hold at most two 2x2 icons.

            int screensForY = (y + 1) / 2;

            // Remaining capacity for 1x1 icons (x) on these screens:
            // Each screen has 15 total cells. If it has k (1 or 2) 2x2 icons,
            // the remaining cells available for 1x1 icons on these screens are:
            // - If 2 icons of 2x2: 15 - 2 * 4 = 7 cells remaining.
            // - If 1 icon of 2x2 on the last screen: 15 - 1 * 4 = 11 cells remaining.

            int totalCellsForYScreens = screensForY * 15;
            int cellsOccupiedByY = y * 4;
            int remainingCellsForX = totalCellsForYScreens - cellsOccupiedByY;

            if (x > remainingCellsForX) {
                int extraX = x - remainingCellsForX;
                // Each extra screen has 15 cells available for 1x1 icons (if no 2x2 icons are placed).
                screensForY += (extraX + 14) / 15;
            }

            System.out.println(screensForY);
        }

        scanner.close();
    }
}