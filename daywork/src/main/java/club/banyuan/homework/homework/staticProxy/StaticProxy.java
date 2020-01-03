package club.banyuan.homework.homework.staticProxy;

public class StaticProxy implements Interface {
    private  Student student;

    public StaticProxy(Student student) {
        this.student = student;
    }

    @Override
    public void show() {
        student.show();
    }
}
