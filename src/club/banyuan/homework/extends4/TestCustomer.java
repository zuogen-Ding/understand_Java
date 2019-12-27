package club.banyuan.homework.extends4;





        /*C写一个测试程序。
        (1)创建一个Customer ,名字叫 Jane Smith, 他有一个账号为1000,余额为2000元,年利率为 1.23% 的账户。
        (2)对Jane Smith操作。
        存入 100 元,再取出960元。再取出2000元。打印出Jane Smith 的基本信息
        成功存入 :100.0,成功取出:960.0,余额不足,取款失败
        */

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer=new Customer("Jane","Smith");
        customer.setIdCard("1000");
        customer.setBalance(2000);
        customer.setAnnualInterestRate("1.23%");

        customer.deposit(100.0);
        customer.withdraw(960.0);
        customer.withdraw(2000.0);

        customer.display();

    }
}
