import java.util.Scanner;
public class OnlineGame {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=5;n/i>=1;i=i*5)
            count=count+n/i;
        System.out.println(count);
    }
}
