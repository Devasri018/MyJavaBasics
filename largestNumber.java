import java.util.Scanner;
public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = -999999, b = -999999;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > a) {
                b = a;
                a = num;
            } else if (num > b && num != a) {
                b= num;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}












