import  java.util.Scanner;
public class Newyearandhurry750A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int problems =  scanner.nextInt();
        int minutes  = scanner.nextInt();
        // Process
        int totalTime = 240;
        int totalMinutesForProblem = 0;
        int remainingTime = totalTime - minutes;
        int count = 0;

        for (int i=0;i<problems;i++){
            totalMinutesForProblem = 5*(i+1);
            if (remainingTime >= totalMinutesForProblem){
                remainingTime = remainingTime - totalMinutesForProblem;
                count++;
            }
        }
        // Output
        System.out.println(count);
        scanner.close();
    }
}