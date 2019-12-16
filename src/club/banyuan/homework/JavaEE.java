package club.banyuan.homework;

public class JavaEE extends Teacher{

    public JavaEE(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println(getName()+"在教JavaEE的课程");
    }
}
