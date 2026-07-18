import java.util.Scanner;
public class Nextround158A
{
	public static void main(String[] args)
	{
        // Take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[n];
        // Process
        int sum = 0;
        for (int i = 0; i < n; i++){
            scores[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (scores[i] >= scores[k-1] && scores[i] > 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}