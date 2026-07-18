import java.util.Scanner;
public class Georgeandaccommodation467A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int numberOfRooms = scanner.nextInt();
        // Process
        int output = 0;
        for (int i = 0; i < numberOfRooms; i++) {
            int numberOfPeopleInRoom = scanner.nextInt();
            int numberOfPoepleCanAcc = scanner.nextInt();
            if  (numberOfPoepleCanAcc - numberOfPeopleInRoom >= 2) {
                output++;
            }
        }
        // Output
        System.out.println(output);
    }
}