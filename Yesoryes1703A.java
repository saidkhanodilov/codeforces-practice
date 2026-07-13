import java.util.Scanner;
public class Yesoryes1703A {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            String input = scanner.next();
            String toLowerCase = input.toLowerCase();
            if(toLowerCase.equals("yes")){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}