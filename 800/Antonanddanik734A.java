import  java.util.Scanner;
public class Antonanddanik734A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int intputInt = scanner.nextInt();
        String stringInput = scanner.next();
        // Process
        char Anton = 'A';
        char Danik = 'D';
        int AntonWins = 0;
        int DanikWins = 0;
        for(int i = 0; i < intputInt; i++){
            char eachLetter = stringInput.charAt(i);
            if(eachLetter == Danik){
                DanikWins++;
            }
            else {
                AntonWins++;
            }
        }
        // Output
        if(AntonWins > DanikWins){
            System.out.println("Anton");
        }
        else if(DanikWins > AntonWins){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}