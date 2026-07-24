import java.util.Scanner;

public class Vanyaandcubes492A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        int cubesNeededForLevel = 0;

        for (int level = 1; ; level++) {
            cubesNeededForLevel += level;

            if (n >= cubesNeededForLevel) {
                n -= cubesNeededForLevel;
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}