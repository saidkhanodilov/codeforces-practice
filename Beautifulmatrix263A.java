import java.util.Scanner;
public class Beautifulmatrix263A
{
    public static void main(String[] arg) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int row = -1;
        int col = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int val = scanner.nextInt();
                if (val == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        // Process
        int moves = Math.abs(row - 2) + Math.abs(col - 2);
        //Output
        System.out.println(moves);
    }
    }
