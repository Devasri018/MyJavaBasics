import java.util.Scanner;
public class PCab {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();
            boolean f = false;
            for (int i = 0; i < n; i++) {
                int d = sc.nextInt();
                if (d >= start && d <= end) {
                    System.out.print(d + " ");
                    f = true;
                }
            }

            if (!f)
                System.out.println("-1");
        }
    }

