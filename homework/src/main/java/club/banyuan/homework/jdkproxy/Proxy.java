package club.banyuan.homework.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy implements InvocationHandler {
    private TeachImpl teach;

    public Proxy(TeachImpl teach) {
        this.teach = teach;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o   = method.invoke(teach,args);

        return  o;
    }
}
