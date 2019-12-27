package club.banyuan.homework.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        Teach teach=new Teach();
        CglibDemo cglibDemo=new CglibDemo(teach);
        //工具类
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(teach.getClass());
        //设置回调函数
        enhancer.setCallback(cglibDemo);
        //创建代理(子类)对象
        Teach t=(Teach) enhancer.create();
        t.teachStu();

    }
}
