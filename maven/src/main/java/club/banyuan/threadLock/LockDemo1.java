package club.banyuan.threadLock;

public class LockDemo1 {


    //1.现在有三个线程,如何保持三个线程按照顺序执行
    String name;
    int size;
    boolean flag=false;
    boolean flag2=false;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



}
