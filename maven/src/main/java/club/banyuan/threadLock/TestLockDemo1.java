package club.banyuan.threadLock;

public class TestLockDemo1 {
    public static void main(String[] args) throws InterruptedException {
        LockDemo1 lockDemo1=new LockDemo1();
        GetDemo2 getDemo2 =new GetDemo2("消费2",lockDemo1);
        GetDemo1 getDemo1=new GetDemo1("消费1",lockDemo1);

        SetDemo setDemo=new SetDemo("生产",lockDemo1);

        setDemo.start();

        getDemo1.start();

        getDemo2.start();

    }
}
