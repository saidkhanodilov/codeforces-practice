import java.util.Scanner;

public class Squarestring1619A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        while (t-- > 0) {
            String text = scanner.next();
            int n = text.length();

            if (n % 2 != 0) {
                System.out.println("NO");
            } else {
                int mid = n / 2;
                String firstHalf = text.substring(0, mid);
                String secondHalf = text.substring(mid);

                if (firstHalf.equals(secondHalf)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        scanner.close();
    }
}