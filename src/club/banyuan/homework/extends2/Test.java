package club.banyuan.homework.extends2;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("张三","男",12,"中国","清华",120);
        student.eat();
        student.sleep();
        student.work();


        Worker worker= new Worker("张三","男",12,"中国","半圆",2);
        worker.work();
        worker.eat();
        worker.sleep();


        StudentLeader studentLeader=new StudentLeader("张三","男",12,"中国","清华",120,"会长");
        studentLeader.eat();
        studentLeader.meeting();
        studentLeader.sleep();
        studentLeader.work();
    }


}
