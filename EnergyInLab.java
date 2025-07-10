import java.util.Scanner;
public class EnergyInLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int energy = a;
        for (int i = 0; i < n; i++) {
            System.out.print(energy + " ");
            energy =energy*b;
        }
    }
}