class Bank {
    private String name;
    private int number;
    private double balance;

    Bank(String name, int number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    void withdraw(int n){
        if(n<balance){
            System.out.println("withdraw done" +balance);
            balance-=n;
            System.out.println("balance"+balance);
        }else{
            System.out.println("withdraw not done" +balance);
        }
    }
    void deposit(double amount){
        if(amount<balance){
            System.out.println("deposit done"+amount);
            balance+=amount;
            System.out.println("balance"+balance);
        }else{
            System.out.println("deposit not done" +amount);
        }
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Bank b =new Bank("deva",1675,50000);
        b.withdraw(5000);
        b.deposit(500);
    }
}
