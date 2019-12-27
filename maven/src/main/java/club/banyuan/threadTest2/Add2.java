package club.banyuan.threadTest2;

public class Add2 extends Thread {
    Example example ;
    static boolean flag=false;
    int countb=0;

    public Add2(String name, Example example) {
        super(name);
        this.example = example;
    }

    @Override
    public void run() {
        synchronized (example) {

            while ( example.f == 0 &&countb==0&&!flag&&!example.flag1&&example.s<2&&example.s>-2){
                example.i++;
                example.s++;


                System.out.println(Thread.currentThread().getName()+"+1"+"---->"+example.s);
                example.notifyAll();
                if (example.i ==1) {
                    flag=true;
                    example.flag1=true;
                    countb++;
                    try {
                        example.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(example.i==2){
                    example.i = 0;
                    flag = false;
                    example.flag2=false;
                    countb=0;
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



