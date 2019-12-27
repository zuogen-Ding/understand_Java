package club.banyuan.threadTest;

//有三个线程,输出200到400之间所有的数据,如果是奇数那么就输出当前线程的名称

public class ThreadDemo1 implements Runnable {






    public  void   run() {
        synchronized (this) {
            for (int i = 200; i < 401; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }
    }

}
