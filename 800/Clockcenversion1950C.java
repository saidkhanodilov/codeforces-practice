import java.util.Scanner;

public class Clockcenversion1950C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            int hh = Integer.parseInt(s.substring(0, 2));
            String mm = s.substring(3, 5);

            String period = "AM";
            if (hh >= 12) {
                period = "PM";
            }

            if (hh == 0) {
                hh = 12;
            } else if (hh > 12) {
                hh -= 12;
            }

            String hhStr = (hh < 10 ? "0" : "") + hh;
            System.out.println(hhStr + ":" + mm + " " + period);
        }

        scanner.close();
    }
}