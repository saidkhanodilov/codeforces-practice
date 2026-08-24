import java.util.HashSet;
import java.util.Scanner;

public class Copycopycopycopycopy1325B {
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

            System.out.println(uniqueElements.size());
        }

        scanner.close();
    }
}