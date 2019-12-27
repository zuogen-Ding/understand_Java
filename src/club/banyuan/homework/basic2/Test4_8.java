package club.banyuan.homework.basic2;


//定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。

import java.util.Scanner;

public class Test4_8 {
    public static void main(String[] args) {
        int[] arr=new int[10];

        for (int i = 0; i <10 ; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输人一个整数");
            int num= sc.nextInt();
            arr[i]=num;
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("一个数");
        int num= sc.nextInt();
        int count =0;
        for (int i = 0; i <10 ; i++) {
            if(arr[i]==num){
                System.out.println(i);
                count++;
            }
        }
        if(count==0){
            System.out.println("没有找到");
        }
    }




}
