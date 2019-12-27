package club.banyuan.homework.basic1;

import java.util.Scanner;

//从键盘输入一个班5个学生的分数，求和并输出

public class Test3_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人第一个学生的分数");
        int  num1=sc.nextInt();
        System.out.println("请输人第二个学生的分数");
        int  num2=sc.nextInt();
        System.out.println("请输人第三个学生的分数");
        int  num3=sc.nextInt();
        System.out.println("请输人第四个学生的分数");
        int  num4=sc.nextInt();
        System.out.println("请输人第五个学生的分数");
        int  num5=sc.nextInt();
        System.out.println("这5个学生的分数总和是"+(num1+num2+num3+num4+num5));
    }
}
