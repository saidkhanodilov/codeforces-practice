import java.util.Scanner;

public class Evenarray1367B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            int wrongEven = 0;
            int wrongOdd = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();

                if (i % 2 != arr[i] % 2) {
                    if (i % 2 == 0) {
                        wrongEven++;
                    } else {
                        wrongOdd++;
                    }
                }
            }

            if (wrongEven != wrongOdd) {
                System.out.println(-1);
            } else {
                System.out.println(wrongEven);
            }
        }
        scanner.close();
    }
}