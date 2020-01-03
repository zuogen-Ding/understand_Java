package club.banyuan.jdbc.uitl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) {
        try {
            Class clazz=Class.forName("club.banyuan.project.view.Student");
            Constructor[]  con= clazz.getConstructors();
            Method[] method= clazz.getMethods();
            for (Method m:method) {
                System.out.println(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
