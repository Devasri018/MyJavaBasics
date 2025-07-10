import java.util.Scanner;
public class Bucketize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id:");
        String id=sc.nextLine();
        int max=0;
        for(char ch:id.toCharArray()){
            int digit=ch-'0';
            if(digit>max){
                max=digit;
            }
        }
        System.out.println(max);
    }
}
