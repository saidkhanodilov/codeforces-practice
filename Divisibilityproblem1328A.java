//import java.util.Scanner;
//
//public class Dbisibilityproblem1328A {
//    public static void main(String[] args) {
//        // Take input
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        // Process
//        int[] results = new int[t];
//        int i = 0;
//        for (i = 0; i < t; i++) {
//            int first = scanner.nextInt();
//            int second = scanner.nextInt();
//            int output = 0;
//            while (first % second != 0) { // it takes some much trials and time to reach the intended result
//                first++;
//                output++;
//            }
//            results[i] = output;
//        }
//        for (i = 0; i < t; i++) {
//            System.out.println(results[i]);
//        }
//    }
//}
import java.util.Scanner;

public class Divisibilityproblem1328A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int[] results = new int[t];
        for (int i = 0; i < t; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            results[i] = (second - first % second) % second; // formula
        }

        for (int i = 0; i < t; i++) {
            System.out.println(results[i]);
        }
    }
}