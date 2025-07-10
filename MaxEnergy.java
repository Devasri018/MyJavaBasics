import java.util.Scanner;
public class MaxEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = -1000000000;
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int p = a[i] * a[j];
                if (p > max) {
                    max = p;
                    sum = a[i] + a[j];
                }
            }
        System.out.println(sum);
    }
}