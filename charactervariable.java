import java.util.Scanner;
public class charactervariable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println((char)(ch-32));
        }else if(ch>='A'&&ch<='Z'){
            System.out.println((char)(ch+32));
        }else{
            System.out.println("not a alphabet");
        }
    }
}
