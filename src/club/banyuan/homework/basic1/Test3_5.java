package club.banyuan.homework.basic1;

//请输入一个任意年份,判断是否是闰年

import java.util.Scanner;

public class Test3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人第一个年份");
        int  num=sc.nextInt();
        if(num%4==0){
            System.out.println("闰年");
        }else{
            System.out.println("非闰年");
        }
    }
}
