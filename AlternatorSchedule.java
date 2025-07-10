import java.util.Scanner;
public class AlternatorSchedule {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int odd = 1;
            int even = 2;
            for (int dy = 1; dy <= n; dy++) {
                for (int i = 1; i <= dy; i++) {
                    if (dy % 2 == 1) {
                        System.out.print(odd+ " ");
                        odd=odd+ 2;

                    } else {
                        System.out.print(even+ " ");
                        even=even+2;
                    }
                }
                System.out.println(" ");
            }
            sc.close();
        }
    }

