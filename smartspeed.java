import java.util.Scanner;
public class smartspeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your speed:");
        int sd = sc.nextInt();
        if(sd<0||sd>200) {
            System.out.println("invalid number");
        }
        else if(sd==0){
            System.out.println("Oops! start the car!");
        }
        else if(sd>0 && sd<=60){
            System.out.println("You are driving safety.keep it up!");
        }
        else if(sd>60 && sd<=70){
            System.out.println("Warning.you are slightly over the speed limit.slow down!");
        }
        else {
            System.out.println("you are speeding! you will receive a ticket");
        }
    }
}
