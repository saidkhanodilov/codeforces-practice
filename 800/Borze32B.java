import java.util.Scanner;

public class Borze32B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.'){
                result.append('0');
            }
            else{
                if(i+1 < str.length() && str.charAt(i+1) == '.'){
                    result.append('1');
                }
                else{
                    result.append('2');
                }
                i++;
            }
        }
        System.out.println(result.toString());
    }
}
