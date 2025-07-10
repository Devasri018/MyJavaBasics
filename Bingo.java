import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (i != j) { // avoid multiplying same element with itself unless intended
                    int p = a[i] * a[j];
                    if (p > max) {
                        max = p;
                        sum = a[i] + a[j];
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
