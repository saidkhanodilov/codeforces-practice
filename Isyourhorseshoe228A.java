import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Isyourhorseshoe228A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> colors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            colors.add(scanner.nextInt());
        }

        System.out.println(4 - colors.size());
        scanner.close();
    }
}