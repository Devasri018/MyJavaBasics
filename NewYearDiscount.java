import java.util.Scanner;
public class NewYearDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int discount = 0;
        while (bill > 0) {
            int digit = bill % 10;
            if (digit % 2 != 0)
                discount = discount + digit;
            bill = bill/10;
        }
        System.out.println(discount);
    }
}