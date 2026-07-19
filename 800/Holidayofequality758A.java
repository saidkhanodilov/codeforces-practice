import java.util.Scanner;

public class Holidayofequality758A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int maxSum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i]>maxSum){
                maxSum = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            result += (maxSum - arr[i]);
        }
        System.out.println(result);

    }
}
