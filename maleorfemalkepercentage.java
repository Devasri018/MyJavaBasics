import java.util.Scanner;
public class maleorfemalkepercentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String gender = sc.next();
        int age = sc.nextInt();
        if(gender.equals("Female") && age<=58){
            System.out.println("8.2%");
        }else if(gender.equals("Female")&& age<=100){
            System.out.println("9.2%");
        }else if(gender.equals("Male")&& age <=58){
            System.out.println("8.4%");
        }else if(gender.equals("Male")&& age<=100){
            System.out.println("10.5%");
        }else{
            System.out.println("invalid");
        }
    }
}
