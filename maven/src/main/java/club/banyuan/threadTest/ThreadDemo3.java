package club.banyuan.threadTest;


//模范 一个账户 1000块钱 :两个人 A B 分别在柜台和ATM机 取钱 A每次取钱100 B每次取200 最终在控制台输出每个人取钱数

public class ThreadDemo3 implements Runnable {

    int money = 1000;
    private int withdraw1 = 0;
    private int withdraw2 = 0;


    public synchronized void makeMoney() {
        String s = Thread.currentThread().getName();
        if (money > 0) {
            if (s.equals("柜台")) {
                money -= 100;
                withdraw1 += 100;
                Thread.yield();
                System.out.println("A取钱，" + "总共" + withdraw1 + "，还剩" + money + "元");
            } else if (s.equals("ATM")) {
                if ((money - 200) >= 0) {
                    money -= 200;
                    withdraw2 += 200;
                    Thread.yield();
                    System.out.println("B取钱，" + "总共" + withdraw2 + "，还剩" + money + "元");
                }
            }


        }
    }

    @Override
    public void run() {
        while (money > 0) {
            makeMoney();
        }
    }
}
