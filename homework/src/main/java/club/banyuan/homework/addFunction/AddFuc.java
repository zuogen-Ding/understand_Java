package club.banyuan.homework.addFunction;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AddFuc implements MethodInterceptor {
    private Object object;

    public AddFuc(Object object) {
        this.object = object;
    }

    private void playBoy(){
        System.out.println("HAPPY---->>>>HAPPY");
    }

    public  Object getProxy(){

        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        Object o= enhancer.create();
        return o;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        method.invoke(object,objects);
        playBoy();
        return null;
    }
}
