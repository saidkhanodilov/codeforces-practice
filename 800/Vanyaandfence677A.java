import java.util.*;
public class Vanyaandfence677A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int heightOfFence = scanner.nextInt();
        // Process
        int outCome = numberOfPeople;
        int[] heightOfPeople = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            heightOfPeople[i] = scanner.nextInt();
            if(heightOfPeople[i] > heightOfFence){
                outCome++;
            }
        }
        // Output
        System.out.println(outCome);
        scanner.close();
    }
}