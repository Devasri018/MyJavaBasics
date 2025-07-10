import java.util.Scanner;
public class EmployeeRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int erp=sc.nextInt();
        char erg;
        if(erp>=80&&erp<=100)
            erg='A';
        else if(erp>=61&&erp<=80)
            erg='B';
        else if(erp>=51&&erp>=60)
            erg='C';
        else
            erg='D';
        System.out.println(erg);

    }
}
