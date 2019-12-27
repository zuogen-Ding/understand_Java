package club.banyuan.threadLock;

public class GetDemo2 extends Thread {
    LockDemo1 lockDemo1;

    public GetDemo2(String name, LockDemo1 lockDemo1) {
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
                if(!lockDemo1.flag&&!lockDemo1.flag2){

                    lockDemo1.notifyAll();

                    try {

                        lockDemo1.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while (lockDemo1.flag && lockDemo1.flag2) {
                    lockDemo1.flag = false;
                    lockDemo1.flag2= false;
                    System.out.println(Thread.currentThread().getName() + lockDemo1.name);







                }

            }
        }

    }
}
