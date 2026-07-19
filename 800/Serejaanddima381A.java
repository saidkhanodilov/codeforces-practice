import java.util.Scanner;

public class Serejaanddima381A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Process
        int countS = 0;
        int countD = 0;
        int left = 0;
        int right = n - 1;

        boolean serejaTurn = true;

        while (left <= right) {
            int chosenCard;


            if (arr[left] > arr[right]) {
                chosenCard = arr[left];
                left++;
            } else {
                chosenCard = arr[right];
                right--;
            }


            if (serejaTurn) {
                countS += chosenCard;
            } else {
                countD += chosenCard;
            }

            serejaTurn = !serejaTurn;
        }
        // Output
        System.out.println(countS + " " + countD);
        scanner.close();
    }
}