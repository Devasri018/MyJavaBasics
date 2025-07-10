import java.util.Scanner;
public class oddoreven {
    static void printEvenodd(int[] arr) {
        System.out.print("Even numbers: ");
        for (int n : arr) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int n: arr) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        printEvenodd(numbers);
    }
}

