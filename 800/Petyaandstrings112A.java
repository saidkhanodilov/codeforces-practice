import java.util.Scanner;
import java.lang.String;
public class Petyaandstrings112A {
    public static void main(String[] args) {
     // Take input
        Scanner scanner =  new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
     // Process and Output
        if (firstLine.toLowerCase().equals(secondLine.toLowerCase())) {
            System.out.println(0);
        }
        else if (firstLine.toLowerCase().compareTo(secondLine.toLowerCase()) > 0) {
            System.out.println(1);
        }
        else if (firstLine.toLowerCase().compareTo(secondLine.toLowerCase()) < 0) {
            System.out.println(-1);
        }
    }
}