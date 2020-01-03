package club.banyuan.homework.homework.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy  implements InvocationHandler {
    private Student student;//Object object

    public JDKProxy(Student student) {
        this.student = student;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(student,args);
        return null;
    }
}
