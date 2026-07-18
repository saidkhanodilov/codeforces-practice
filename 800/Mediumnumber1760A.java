import java.util.Scanner;
import java.util.Arrays; // Import this

public class Mediumnumber1760A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int[] arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();

            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}