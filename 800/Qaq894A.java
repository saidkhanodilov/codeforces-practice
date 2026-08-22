import java.util.Scanner;
public class Qaq894A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long qCount = 0;
        long qaCount = 0;
        long qaqCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'Q') {
                qaqCount += qaCount;
                qCount++;
            } else if (c == 'A') {
                qaCount += qCount;
            }
        }
        System.out.println(qaqCount);
        scanner.close();
    }
}