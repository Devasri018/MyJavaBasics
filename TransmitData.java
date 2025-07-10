import java.util.Scanner;
public class TransmitData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int data=sc.nextInt();
         int reversed=0;
        while (data != 0) {
            int digit = data % 10;
            reversed = reversed * 10 + digit;
            data =data/ 10;
        }
        System.out.println(reversed );
    }
}
