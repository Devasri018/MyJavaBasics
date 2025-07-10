import java.util.Scanner;
public class SquarePlots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int area =sc.nextInt();
            int root=(int)Math.sqrt(area);
            if(root*root==area){
                count++;
            }
        }
        System.out.println(count);
    }
}
