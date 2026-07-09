import java.util.Scanner;
public class Magnets344A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        // Process
        String [] magnet = new String[input];
        for (int i = 0; i < input; i++){
            magnet[i] = scanner.next();
        }
        int groups =  input > 0 ? 1 : 0;
        for (int i = 1; i < input; i++){
            if (!(magnet[i].equals(magnet[i-1]))){
                groups++;
            }
        }
        // Output
        System.out.println(groups);
        scanner.close();
    }
}