import java.util.HashMap;
import java.util.Scanner;

public class Doremyspaint31890A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            if (freq.size() > 2) {
                System.out.println("No");
                continue;
            }
            if (freq.size() == 1) {
                System.out.println("Yes");
                continue;
            }
            int[] vals = freq.values().stream().mapToInt(Integer::intValue).toArray();
            int diff = Math.abs(vals[0] - vals[1]);

            System.out.println(diff <= 1 ? "Yes" : "No");
        }
        scanner.close();
    }
}