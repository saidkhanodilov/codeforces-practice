import java.util.Scanner;

public class Spydetected1512A {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    while (t-- > 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }

      int common;
      if (arr[0] == arr[1]) {
        common = arr[0];
      } else if (arr[0] == arr[2]) {
        common = arr[0];
      } else {
        System.out.println(1);
        continue;
      }

      for (int i = 0; i < n; i++) {
        if (arr[i] != common) {
          System.out.println(i + 1);
          break;
        }
      }
    }
  }
}