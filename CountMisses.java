import java.util.Scanner;
public class CountMisses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != ' ')
                count++;
        }
        System.out.println(count);
    }
}