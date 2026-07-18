import java.util.Scanner;public class Bit282A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines =  scanner.nextInt();
        int totalValue = 0;

        for (int i = 0; i < numberOfLines; i++) {
            String a = scanner.next();
            if (a.contains("+")) {
                totalValue++;
            } else {
                totalValue--;
            }
        }
        System.out.println(totalValue);

    }
}