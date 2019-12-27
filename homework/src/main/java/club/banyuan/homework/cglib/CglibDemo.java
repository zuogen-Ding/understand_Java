package club.banyuan.homework.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDemo implements MethodInterceptor {

    private  Object object;

    public CglibDemo(Object object) {
        this.object = object;
    }



    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        method.invoke(object,objects);

        return null;
    }
}
