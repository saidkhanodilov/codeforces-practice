import java.util.*;
public class Antonandplyhedrons785A {
    public static void main(String[] args) {
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        String t = "Tetrahedron";
        String c = "Cube";
        String o = "Octahedron";
        String d = "Dodecahedron";
        String i1 = "Icosahedron";
        for (int i = 0; i < n; i++){
             String shape = scanner.next();
            if (shape.equals(t)) {
                count+=4;
            }
            else if (shape.equals(c)) {
                count+=6;
            }
            else if (shape.equals(o)){
                count+=8;
            }
            else if (shape.equals(d)) {
                count +=12;
            }
            else if (shape.equals(i1)) {
                count+=20;
            }
        }
        // Output
        System.out.println(count);
        scanner.close();
    }
}