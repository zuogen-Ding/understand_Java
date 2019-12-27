package club.banyuan.threadLock;

public class SetDemo extends Thread {

    LockDemo1 lockDemo1;
    int count = 0;




    public SetDemo(String name, LockDemo1 lockDemo1) {
        super(name);
        this.lockDemo1 = lockDemo1;



    }

    @Override
    public void run() {

        synchronized (lockDemo1) {

            while (true) {

                lockDemo1.notifyAll();

                if (lockDemo1.flag) {

                    try {

                        lockDemo1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                while (count == 0 || count % 2 == 1) {
                    lockDemo1.setName("足球");
                    count++;
                }

                lockDemo1.flag = true;
                System.out.println(Thread.currentThread().getName());




            }
        }
    }
}
