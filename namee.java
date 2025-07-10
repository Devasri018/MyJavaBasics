import java.sql.SQLOutput;

public class namee {
    public static void main(String[] args) {
        int n=2;
        int count=0;
        for(int i=0;i<n;i++){
            if(n%i==0){
                count++;
            }
            while(count==2)
                System.out.println(i);
        }
    }
}
