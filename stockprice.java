 import java.util.Scanner;
    public class stockprice {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double sum = 0;
            double max = 0;
            double min = 1000000000;
            for (int i = 0; i < n; i++) {
                int price = sc.nextInt();
                if (price > max) {
                    max = price;
                }
                if (price < min) {
                    min = price;
                }
                sum = sum + price;
            }
            double avg= sum / n;
            System.out.println(max);
            System.out.println(min);
            System.out.printf("%.2f\n",+avg);
            sc.close();
        }
    }
