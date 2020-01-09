package club.banyuan.work.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUse {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class stuClass=Class.forName("club.banyuan.work.reflection.Student");
        Object student=stuClass.newInstance();
        Field[] fields= stuClass.getDeclaredFields();
        for (Field f :fields) {
            System.out.println(f.getName());
        }
        Method[] methods=stuClass.getMethods();
        for (Method m :methods) {
            System.out.println(m.getName());
        }
        Method method=stuClass.getMethod("shoe");
        method.invoke(student);
        Field field=stuClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(student,"李四");
        String s2=(String)field.get(student);
        System.out.println(s2);
    }

}
