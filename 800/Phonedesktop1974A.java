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

            int screensForY = (y + 1) / 2;


            int totalCellsForYScreens = screensForY * 15;
            int cellsOccupiedByY = y * 4;
            int remainingCellsForX = totalCellsForYScreens - cellsOccupiedByY;

            if (x > remainingCellsForX) {
                int extraX = x - remainingCellsForX;

                screensForY += (extraX + 14) / 15;
            }

            System.out.println(screensForY);
        }

        scanner.close();
    }
}