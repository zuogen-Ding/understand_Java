package club.banyuan.threadTest2;

public class Sub1 extends Thread {
    Example example;
    static boolean flag=false;
    int countc=0;


    public Sub1(String name, Example example) {
        super(name);

        this.example = example;
    }

    @Override
    public void run() {
        synchronized (example) {

            while (true) {
                while (example.i == 0&&countc==0&&!flag&& !example.flag1&&example.s<2&&example.s>-2) {
                    example.f++;
                    example.s--;
                    System.out.println(Thread.currentThread().getName()+"-1"+"---->"+example.s);
                    example.notifyAll();
                    if (example.f  ==1) {
                        flag=true;
                        example.flag2=true;
                        countc++;
                        try {
                            example.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        example.f = 0;
                        flag=false;
                        example.flag2=false;
                        countc=0;
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
