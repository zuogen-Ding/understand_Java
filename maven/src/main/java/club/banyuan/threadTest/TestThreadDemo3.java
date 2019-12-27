package club.banyuan.threadTest;

public class TestThreadDemo3 {
    public static void main(String[] args) {
        ThreadDemo3 threadDemo3=new ThreadDemo3();

        Thread thread1=new Thread(threadDemo3,"柜台");
        Thread thread2=new Thread(threadDemo3,"ATM");

        thread1.start();
        thread2.start();


    }
}
