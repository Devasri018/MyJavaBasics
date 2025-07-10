import java.util.Arrays;
public class sortarray {
    public static void main(String[] args) {
        int [] n={32,21,43,54,34,65};
        Arrays.sort(n);
        System.out.println("Sorted Array:");
        for(int num:n){
            System.out.println(num+ " ");
        }
    }
}
