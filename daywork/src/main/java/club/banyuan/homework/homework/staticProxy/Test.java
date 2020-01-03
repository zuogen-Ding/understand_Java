package club.banyuan.homework.homework.staticProxy;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        StaticProxy staticProxy=new StaticProxy(student);
        staticProxy.show();
    }

}
