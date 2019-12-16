package club.banyuan.homework.extends4;


/*A.写一个名为Account的类模拟账户。该类的属性和方法如下图所示。该类包括的属性:账号id,余额balance,年利率annualInterestRate;
        包含的方法:访问器方法(getter和setter方法),取款方法withdraw(),存款方法deposit()。
        提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。*/
public class Account {
    private String IdCard;
    private double balance;
    private String annualInterestRate;

    public Account() {
    }

    public Account(String idCard, double balance, String annualInterestRate) {
        IdCard = idCard;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double num){
        if(balance-num>=0){
            balance=balance-num;
            System.out.println("成功取出 :"+num);
        }else {
            System.out.println("余额不足,取款失败");
        }
    }

    public void deposit(double num){
        balance=balance + num;
        System.out.println("成功存入 :"+num);
    }
}
