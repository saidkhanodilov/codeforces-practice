import java.util.Scanner;
public class Thenewyearmeatingfreands723A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        // Process
       int max=x1;
       if(x2>max){
           max=x2;
       }
       if(x3>max){
           max=x3;
       }
       int min=x3;
       if(x2<min){
           min=x2;
       }
       if(x1<min){
           min=x1;
       }
       //Output
        System.out.println(max-min);
       scanner.close();
    }
}