import java.util.Scanner;

public class Upscaling1950B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();

            for (int r = 0; r < 2 * n; r++) {
                StringBuilder sb = new StringBuilder();
                for (int c = 0; c < 2 * n; c++) {
                    int blockR = r / 2;
                    int blockC = c / 2;

                    if ((blockR + blockC) % 2 == 0) {
                        sb.append('#');
                    } else {
                        sb.append('.');
                    }
                }
                System.out.println(sb.toString());
            }
        }

        scanner.close();
    }
}