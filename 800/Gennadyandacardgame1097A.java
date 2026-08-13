import java.util.Scanner;

public class Gennadyandacardgame1097A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()) {
            return;
        }

        String tableCard = scanner.next();
        char tableRank = tableCard.charAt(0);
        char tableSuit = tableCard.charAt(1);

        boolean canPlay = false;

        for (int i = 0; i < 5; i++) {
            String handCard = scanner.next();
            if (handCard.charAt(0) == tableRank || handCard.charAt(1) == tableSuit) {
                canPlay = true;
            }
        }

        if (canPlay) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}