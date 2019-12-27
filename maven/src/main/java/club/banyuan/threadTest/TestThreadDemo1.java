package club.banyuan.threadTest;

public class TestThreadDemo1 {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1=new ThreadDemo1();

        Thread thread1=new Thread(threadDemo1,"线程A");
        Thread thread2=new Thread(threadDemo1,"线程B");
        Thread thread3=new Thread(threadDemo1,"线程C");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
