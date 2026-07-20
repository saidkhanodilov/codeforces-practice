import java.util.*;

public class Teamolympiad490A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> prog = new ArrayList<>();
        List<Integer> math = new ArrayList<>();
        List<Integer> pe   = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int t = scanner.nextInt();
            if (t == 1) prog.add(i);
            else if (t == 2) math.add(i);
            else pe.add(i);
        }

        int w = Math.min(prog.size(), Math.min(math.size(), pe.size()));
        System.out.println(w);

        for (int i = 0; i < w; i++) {
            System.out.println(prog.get(i) + " " + math.get(i) + " " + pe.get(i));
        }

        scanner.close();
    }
}