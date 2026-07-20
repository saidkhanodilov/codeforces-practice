import java.util.Scanner;

public class Shortsort1873A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String input = scanner.next();
                if(input.charAt(0) == 'a'
                || input.charAt(1) == 'b'
                || input.charAt(2) == 'c'){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
        }
        scanner.close();
    }
}
