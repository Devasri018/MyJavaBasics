import java.util.Scanner;
public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        if (i < 0 || j > 9999 || i >= j) {
            System.out.println("Invalid Input");
            return;
        }
        int sum = 0;
        for (int n = i; n <= j; n++) {
            sum = sum+ n;
        }
        System.out.println(sum);
    }
}