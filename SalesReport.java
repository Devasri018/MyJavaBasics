import java.util.Scanner;
public class SalesReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < N; j++) {
                int val = sc.nextInt();
                if (val > max)
                    max = val;
            }
            System.out.print(max + " ");
        }
    }
}