import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        if(k>n||k<0){
            System.out.println("invalid");
        }else {
            for (int i = n - k; i < n; i++)
                System.out.print(arr[i] + " ");
            for (int i = 0; i < n - k; i++)
                System.out.print(arr[i] + " ");
        }

    }
}
