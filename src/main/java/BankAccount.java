public class BankAccount {
    String ownername;
    double balance;


    public BankAccount(String ownername, double balance){
        this.ownername = ownername;
        this.balance = balance;
    }

    public void deposit(int n){
        this.balance = balance + n;
    }

    public  void withdrawal(int n){
        this.balance = balance - n;
    }

    public void displayBalance(){
        System.out.println("Current balance is: " + this.balance);
    }

    public static void main(){
        BankAccount contulMeu = new BankAccount("Laura", 250);
        contulMeu.deposit(100);
        contulMeu.deposit(200);
        contulMeu.withdrawal(400);
        contulMeu.displayBalance();
    }
}
