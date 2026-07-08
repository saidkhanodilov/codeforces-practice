import java.util.*;

public class Queueattheschool266A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String queueString = scanner.next();
        // Process
        char[] queue = queueString.toCharArray();
        for (int seconds = 0; seconds < t; seconds++) {
            int i = 0;
            while (i < n - 1) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    // Swap their positions
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i += 2;
                } else {
                    i += 1;
                }
            }
        }

        // Output
        String output = new String(queue);
        System.out.println(output);
        scanner.close();
    }
}


