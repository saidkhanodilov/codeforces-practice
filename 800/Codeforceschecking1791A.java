//import java.util.Scanner;
//
//public class Codeforceschecking1791A{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i = 1; i <= n; i++) {
//            String a = scanner.next();
//            if(a.toLowerCase().charAt(0) == 'c'
//            || a.toLowerCase().charAt(0) == 'o'
//            || a.toLowerCase().charAt(0) == 'd'
//            || a.toLowerCase().charAt(0) == 'e'
//            || a.toLowerCase().charAt(0) == 'f'
//            || a.toLowerCase().charAt(0) == 'o'
//            || a.toLowerCase().charAt(0) == 'r'
//            || a.toLowerCase().charAt(0) == 'c'
//            || a.toLowerCase().charAt(0) == 'e'
//            || a.toLowerCase().charAt(0) == 's'){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//        }
//    }
//}
import java.util.Scanner;

public class Codeforceschecking1791A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String target = "codeforces";

        for (int i = 0; i < n; i++) {
            String a = scanner.next();

            if (target.contains(a)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}