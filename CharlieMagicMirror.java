import java.util.Scanner;
public class CharlieMagicMirror {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
           String w1=sc.next();
           String w2=sc.next();
        System.out.println(w1.length()==w2.length()
                &&((w1+w2).contains(w2))?1:0);
    }
}
