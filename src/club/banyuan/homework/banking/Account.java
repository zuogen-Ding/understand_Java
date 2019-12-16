package club.banyuan.homework.banking;

public class Account {
    private  double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public void setBalance(double a){
        this.balance=a;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double c){
        double a=this.balance;
        this.balance=a+c;
    }

    public void withdraw(double c){
        double a=this.balance;
        this.balance=a-c;
    }
}
