import java.util.Scanner;
public class ChristmasDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        while (bill > 0) {
            int digit = bill % 10;
            if (digit % 2 == 0)
                sumEven=sumEven + digit;
            else
                sumOdd =sumOdd + digit;
            bill =bill/ 10;
        }
        int discount = sumOdd * sumEven;
        System.out.println(discount);
    }
}

