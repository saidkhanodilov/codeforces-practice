import java.util.Scanner;

public class Oddoneout1915A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t  = scanner.nextInt();

        while(t-- > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

//            if(a == b){
//                System.out.println(c);
//            }
//            else if (a == c){
//                System.out.println(b);
//            }
//            else{
//                System.out.println(a);
//            }
            System.out.println(a ^ b ^ c);
        }
    }
}