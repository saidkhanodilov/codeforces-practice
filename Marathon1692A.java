import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Take input
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();


    for (int i = 0; i < t; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int d = scanner.nextInt();
  // Process
      int count = 0;

      if (b > a) {
        count++;
      }
      if (c > a) {
        count++;
      }
      if (d > a) {
        count++;
      }
      // Output
      System.out.println(count);
    }
  }
}