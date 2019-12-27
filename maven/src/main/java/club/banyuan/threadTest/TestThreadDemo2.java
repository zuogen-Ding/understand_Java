package club.banyuan.threadTest;

public class TestThreadDemo2 {
    public static void main(String[] args) {
        ThreadDemo2 threadDemo2=new ThreadDemo2();

        Thread thread1=new Thread(threadDemo2,"1号");
        Thread thread2=new Thread(threadDemo2,"2号");
        Thread thread3=new Thread(threadDemo2,"3号");
        Thread thread4=new Thread(threadDemo2,"4号");
        Thread thread5=new Thread(threadDemo2,"5号");
        Thread thread6=new Thread(threadDemo2,"6号");
        Thread thread7=new Thread(threadDemo2,"7号");
        Thread thread8=new Thread(threadDemo2,"8号");
        Thread thread9=new Thread(threadDemo2,"9号");
        Thread thread10=new Thread(threadDemo2,"10号");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
