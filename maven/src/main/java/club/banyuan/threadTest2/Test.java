package club.banyuan.threadTest2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Example example=new Example();

        Add1 add1=new Add1("加A",example);
        Add2 add2=new Add2("加B",example);
        Sub1 sub1=new Sub1("减A",example);
        Sub2 sub2=new Sub2("减B",example);

        add1.start();
        Thread.sleep(2000);
        add2.start();
        Thread.sleep(2000);
        sub1.start();
        Thread.sleep(2000);
        sub2.start();
        Thread.sleep(2000);

    }
}
