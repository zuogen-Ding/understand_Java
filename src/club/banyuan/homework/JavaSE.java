package club.banyuan.homework;

public  class JavaSE  extends Teacher{

    public JavaSE(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println(getName()+"在教JavaSE的课程");
    }
}
