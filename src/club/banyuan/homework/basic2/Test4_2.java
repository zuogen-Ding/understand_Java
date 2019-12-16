package club.banyuan.homework.basic2;

import java.util.Scanner;

//输入三个班，每班10个学生的成绩，求每个班的总分和平均分

 class Student {

    private double[] stu=new double[10];


    public  void  setStu(){
        for (int i = 0; i <10 ; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输人一个整数");
            double num= sc.nextDouble();
            stu[i]=num;
        }
    }

    public void sumStu(){
        double sum=0;
        for (int i = 0; i <10 ; i++) {
            double a=stu[1];
            sum+=a;
        }

        System.out.println("总分是"+sum+"平均分是"+(sum/10));

    }

     public static void main(String[] args) {
         Student student1 =new Student();
         Student student2 =new Student();
         Student student3 =new Student();

         student1.setStu();
         student1.sumStu();
         student2.setStu();
         student2.sumStu();
         student3.setStu();
         student3.sumStu();
     }
}
