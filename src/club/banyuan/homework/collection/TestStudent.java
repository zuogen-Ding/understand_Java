package club.banyuan.homework.collection;

public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("李四");
        student.addStudent();
        System.out.println(student.toString());
        Student student2=new Student();
        student2.setName("李四");
        student2.addStudent();
        System.out.println(student2.toString());
        System.out.println(student.toString());
        System.out.println(student.toString());
    }
}
