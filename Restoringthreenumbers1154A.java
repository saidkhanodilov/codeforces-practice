import java.util.Scanner;
import java.util.Arrays;

public class Restoringthreenumbers1154A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        // Process
        Arrays.sort(arr);
        int s = arr[3];

        int a = s - arr[0];
        int b = s - arr[1];
        int c = s - arr[2];
        // Output
        System.out.println(a + " " + b + " " + c);
        scanner.close();
    }
}