import java.util.Scanner;
public class Walletexchange1919A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < t; tc++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            boolean aliceWins = ((a + b) % 2 == 1);
            sb.append(aliceWins ? "Alice" : "Bob").append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}