import java.util.Scanner;
public class NumCraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 9, b = 0, c = 9, d = 0;
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            a = Math.min(a, n / 1000);
            b = Math.max(b, (n / 100) % 10);
            c = Math.min(c, (n / 10) % 10);
            d = Math.max(d, n % 10);
        }
        System.out.println("" + a + b + c+ d);
    }
}
