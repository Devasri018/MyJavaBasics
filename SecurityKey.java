import java.util.Scanner;
public class SecurityKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        int key=0;
        int [] dC = new int[10];
        for(int i=0;i<n.length();i++) {
            int digit = n.charAt(i) - '0';
            dC[digit]++;
        }
        for(int i=0;i<10;i++){
            if(dC[i]>1) {
                key++;
            }
            }

        if(key==0){
            System.out.println("-1");
        }else{
            System.out.println(key);
        }
    }
}




