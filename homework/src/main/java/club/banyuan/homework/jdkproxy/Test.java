package club.banyuan.homework.jdkproxy;

public class Test {
    public static void main(String[] args) {
        TeachImpl teach=new TeachImpl();
        Proxy proxy=new Proxy(teach);

        Teach t=(Teach) java.lang.reflect.Proxy.newProxyInstance(teach.getClass().getClassLoader(),teach.getClass().getInterfaces(),proxy);
        t.teach();
    }
}
