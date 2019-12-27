package club.banyuan.threadTest2;

public class Sub2 extends Thread {
    Example example;
    static boolean flag=false;
    int countd = 0;


    public Sub2(String name, Example example) {
        super(name);
        this.example = example;
    }

    public void run() {
        synchronized (example) {

            while (true) {
                while (example.i == 0 && countd == 0 && !flag&& !example.flag1&&example.s<2&&example.s>-2) {
                    example.f++;
                    example.s--;
                    System.out.println(Thread.currentThread().getName() + "-1" + "---->" + example.s);
                    example.notifyAll();
                    if (example.f ==1 ) {
                        flag = true;
                        example.flag2=true;
                        countd++;
                        try {
                            example.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        example.f = 0;
                        flag = false;
                        example.flag2 = false;
                        countd = 0;
                        try {
                            example.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                }


            }
        }
    }
}

