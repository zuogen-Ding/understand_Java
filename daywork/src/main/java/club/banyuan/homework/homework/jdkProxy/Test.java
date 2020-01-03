package club.banyuan.homework.homework.jdkProxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        JDKProxy jdkProxy=new JDKProxy(student);
        Student stu=(Student) Proxy.newProxyInstance(
                Student.class.getClassLoader(),Student.class.getInterfaces(),jdkProxy);
        stu.show("你是");
    }

}
