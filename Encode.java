import java.util.Scanner;
public class Encode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d=sc.next();
        char digit = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<d.length();i++) {
            if (d.charAt(i) == digit) {
                count++;
            }
        }
        System.out.println(count);
    }
}

