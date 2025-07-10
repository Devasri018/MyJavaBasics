import java.util.Scanner;
public class MissingData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int sum1=0;
        int sum2=0;
        for(char c:a.toCharArray())
            sum1=sum1+c;
        for(char c : b.toCharArray())
            sum2=sum2+c;
        int difference=sum1-sum2;
        System.out.println(difference==0?
                "NA" : (char)(difference));
    }
}




