package club.banyuan.threadLock;

public class GetDemo1 extends Thread {

    LockDemo1 lockDemo1;


    public GetDemo1(String name, LockDemo1 lockDemo1) {
        super(name);
        this.lockDemo1 = lockDemo1;
    }

    @Override
    public void run() {
        synchronized (lockDemo1) {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                while (lockDemo1.flag && !lockDemo1.flag2) {

                    lockDemo1.flag2 = true;
                    System.out.println(Thread.currentThread().getName() + lockDemo1.getName());





                }
                try {

                    lockDemo1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
