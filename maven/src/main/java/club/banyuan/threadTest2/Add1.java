package club.banyuan.threadTest2;

public class Add1 extends Thread {
    Example example;
    static boolean flag=false;
    int counta=0;

    public Add1(String name, Example example) {
        super(name);

        this.example = example;
    }

    @Override
    public void run() {

        synchronized (example) {
            while ( example.f == 0 &&counta==0&&!flag&&!example.flag1&&example.s<2&&example.s>-2) {


            example.i++;
            example.s++;
                System.out.println(Thread.currentThread().getName()+"+1"+"---->"+example.s);
                example.notifyAll();
                if (example.i ==1) {
                    flag=true;
                    example.flag2=true;
                    counta++;
                    try {
                        example.wait();
                        System.out.println(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(example.i==2){
                    example.i = 0;
                    flag = false;
                    example.flag2=false;
                    counta=0;
                    try {
                        example.wait();
                        System.out.println(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }



        }
    }
}
