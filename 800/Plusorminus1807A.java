import java.util.Scanner;

public class Plusorminus1807A {
  public static void main(String[] args) {
    // Take input
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      // Process and Output
      if (a + b == c) {
        System.out.println("+");
      } else {
        System.out.println("-");
      }
    }
    scanner.close();
  }
}