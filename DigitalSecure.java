import java.util.Scanner;
public class DigitalSecure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch =sc.next().charAt(0);
        int n=sc.nextInt();
        char value=(char)(ch+n);
        System.out.println(value);
    }
}
