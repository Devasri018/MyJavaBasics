import java.util.Scanner;
public class Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int opt=sc.nextInt();
        int result=0;
        for(int i = n; i >= 1; i--) {
            if (opt==1) {
                if((n-i)%2== 0){
                    result+=i;
                }else {
                    result-=i;
                }
            }else if(opt==2){
                if((n-i)%2== 0){
                    result+=i;
                }else{
                    result-=i;
                }
            }
        }
        System.out.println(result);
    }
}
