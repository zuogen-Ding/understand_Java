package club.banyuan.homework.collectionDemo1;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {

        Course course1=new Course(9527,"java基础" );
        Course course2=new Course(9768,"C# " );
        Course course3=new Course(9898,"javaScript" );
        Course course4=new Course(9512,"java高级" );
        Course.courses.add(course1);
        Course.courses.add(course2);
        Course.courses.add(course3);
        Course.courses.add(course4);
        System.out.println(Arrays.toString(Course.courses.toArray()));

        Student student=new Student();
        student.addCourse("java基础");
        student.addCourse("java高级");
        student.addCourse("c#");
        student.outCourse();
        student.delCourse("c#");

        System.out.println(student.findCourse("java高级"));

        student.outCourse();

    }
}
