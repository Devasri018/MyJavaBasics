import java.util.Scanner;
public class palindromeornotpalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(a==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
