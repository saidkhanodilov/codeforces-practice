import java.util.ArrayList;
import java.util.Scanner;

public class Sequencegame1862B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            ArrayList<Integer> a = new ArrayList<>();
            a.add(b[0]);

            for (int i = 1; i < n; i++) {
                if (b[i] < b[i - 1]) {
                    a.add(1);
                }
                a.add(b[i]);
            }

            System.out.println(a.size());
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + (i == a.size() - 1 ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}