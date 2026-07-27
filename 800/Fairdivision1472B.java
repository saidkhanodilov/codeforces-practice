import java.util.Scanner;

public class Fairdivision1472B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        StringBuilder out = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            int count1 = 0;
            int count2 = 0;

            for (int j = 0; j < n; j++) {
                int weight = scanner.nextInt();
                sum += weight;
                if (weight == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }
            if (sum % 2 != 0) {
                out.append("NO\n");
            } else {
                int target = sum / 2;
                if (target % 2 != 0 && count1 == 0) {
                    out.append("NO\n");
                } else {
                    out.append("YES\n");
                }
            }
        }

        System.out.print(out);
        scanner.close();
    }
}