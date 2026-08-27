import java.util.Scanner;
public class Repeatingcipher1095A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String t = scanner.next();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int k = 1;
        while (idx < n) {
            sb.append(t.charAt(idx));
            idx += k;
            k++;
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}