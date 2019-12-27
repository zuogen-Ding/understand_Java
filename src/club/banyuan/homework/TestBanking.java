package club.banyuan.homework;

import club.banyuan.homework.banking.Account;

public class TestBanking {
    public static void main(String[] args){
        Account account= new Account();

        account.setBalance(500.00);
        account.withdraw(150.00);
        account.deposit(22.50);
        account.withdraw(47.62);
        System.out.println(account.getBalance());



    }
}
