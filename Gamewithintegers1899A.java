import java.util.Scanner;
public class  Gamewithintegers1899A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int input = scanner.nextInt();
            if(input % 3 == 0){
                System.out.println("Second");
            }
            else {
                System.out.println("First");
            }
        }
    }
}