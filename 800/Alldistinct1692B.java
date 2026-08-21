import java.util.HashSet;
import java.util.Scanner;

public class Alldistinct1692B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            HashSet<Integer> uniqueElements = new HashSet<>();

            for (int j = 0; j < n; j++) {
                uniqueElements.add(scanner.nextInt());
            }

            // Each operation removes 2 elements. 
            // The number of removed elements must be even, so if the number of duplicate-containing 
            // elements (n - uniqueElements.size()) is odd, we have to remove one more unique element,
            // meaning we subtract 1 from the unique count. Otherwise, the answer is just the unique count.

            int duplicates = n - uniqueElements.size();
            if (duplicates % 2 != 0) {
                System.out.println(uniqueElements.size() - 1);
            } else {
                System.out.println(uniqueElements.size());
            }
        }

        scanner.close();
    }
}