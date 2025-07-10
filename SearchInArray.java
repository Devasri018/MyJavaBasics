import java.util.Scanner;
public class SearchInArray {
    public static void main(String[] args) {
        int [] n={12,43,23,13,41};
        Scanner sc =new Scanner(System.in);
        int searcharray=sc.nextInt();
        System.out.print("Enter the Search In array:");
        int index=-1;
        for(int i=0;i<n.length;i++){
            if(n[i]==searcharray){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
