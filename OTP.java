import java.util.Scanner;
public class OTP {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(),y = s.nextInt();
        int l = Math.min(x, y);
        int r = Math.max(x, y);
        int sp = 0;
        int lp = 0;
        for (int i = l; i <= r; i++)
            if (p(i)) {
                sp = i;
                break;
            }
        for (int i = r; i >= l; i--)
            if (p(i))
            {
                lp = i;
                break;
            }
        System.out.println(sp + lp);
    }
    static boolean p(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}