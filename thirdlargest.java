import java.util.Scanner;
public class thirdlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = -999, b = -999, c = -999;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > c) {
                a = b;
                b = c;
                c = num;
            } else if (num > b && num != c) {
                a = b;
                b = num;
            } else if (num > a && num != b && num != c) {
                a = num;
            }
        }

        System.out.println(a);
    }
}

