import java.util.Arrays;
import java.util.Scanner;

public class Threepairwisemaximums1385A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long z = scanner.nextLong();

            long[] arr = {x, y, z};
            Arrays.sort(arr);

            if (arr[1] != arr[2]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(arr[2] + " " + arr[0] + " " + arr[0]);
            }
        }

        scanner.close();
    }
}