import  java.util.Scanner;
public class Tram116A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int numberOfStops = scanner.nextInt();
        int maxCapacity = 0;
        int currentPeople = 0;
        for (int i = 0; i < numberOfStops; i++) {
            int exitPeople = scanner.nextInt();
            int enterPeople = scanner.nextInt();
            currentPeople = currentPeople + enterPeople - exitPeople;
            if(currentPeople > maxCapacity){
                maxCapacity = currentPeople;
            }
        }


        System.out.println(maxCapacity);
    }
}