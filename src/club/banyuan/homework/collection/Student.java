package club.banyuan.homework.collection;


//9.有一个学生类Student   学生编号，学生姓名，现在对学生仓库做增删改查操作 学生每次被添加  该学生的学号自加1   如 9527   9528  等等

public class Student {
    private int  num ;
    private String name;
    private static int  count=0;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(){
        num++;

    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
