import java.util.Scanner;
public class Translation41A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        // Process
        if (firstLine.length() != secondLine.length()) {
            System.out.println("NO");
        }
        else{
            int j = 0;
            for(int i = 0; i < firstLine.length(); i++){
                if(firstLine.charAt(i) == secondLine.charAt(secondLine.length()-1-i)){
                    continue;
                }
                else {
                    j++;
                }
            }
            if(j == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        // Output

    }
}