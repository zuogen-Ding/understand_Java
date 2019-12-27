package club.banyuan.threadTest;


//现在有一个旅行队10个人,探险进入一线天,这个一线天每次只能过一个人,每个人过的时间是20秒,现在10个人通过该一线天,请输出每个人经过一线天的顺序和姓名

public class ThreadDemo2 implements Runnable {


int count  =1;


    public  synchronized void show() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"第"+count+"个");
        count++;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        show();
    }
}
