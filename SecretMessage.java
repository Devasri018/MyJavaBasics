import java.util.Scanner;
public class SecretMessage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String message=sc.nextLine();
        int count=0;
        for(char ch:message.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
