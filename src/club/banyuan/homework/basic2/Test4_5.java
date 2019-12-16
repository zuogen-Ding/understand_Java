package club.banyuan.homework.basic2;

import java.util.Scanner;

public class Test4_5 {

   // 输入10个整数存入数组，然后复制到b数组中输出
    public static void main(String[] args) {
        int[] arr= new int[10];
        int[] b= new int[10];

        for (int i = 0; i <arr.length ; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输人一个整数");
            int num= sc.nextInt();
            arr[i] =num;
        }

        for (int i = 0; i <arr.length ; i++) {
            b[i]=arr[i];
            System.out.println(b[i]);
        }
    }
}
