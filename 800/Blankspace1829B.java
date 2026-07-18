import java.util.Scanner;

public class Blankspace1829B {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      int m = scanner.nextInt();
      int[] arr = new int[m];

      for (int j = 0; j < m; j++) {
        arr[j] = scanner.nextInt();
      }

      int maxCount = 0;
      int currentCount = 0;

      for (int j = 0; j < m; j++) {
        if (arr[j] == 0) {
          currentCount++;
          if (currentCount > maxCount) {
            maxCount = currentCount;
          }
        } else {
          currentCount = 0;
        }
      }

      System.out.println(maxCount);
    }
  }
}