package club.banyuan.homework.basic1;

//30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数

import java.util.Scanner;

public class Test3_6 {

    public static void main(String[] args) {

        int[] arr= new int[10];
        for (int i = 0;i<10;i++){
            double a=Math.random();
            int j=(int)(30*a);
            arr[i]=j;

        }

        Scanner sc=new Scanner(System.in);
        System.out.println("请输人一个数");
        int  num=sc.nextInt();


        int count =0;

        for (int i = 0; i < 10; i++) {
            if(arr[i]==num){
                count++;
            }

        }

        System.out.println("这个数在随机范围内出现的次数："+count);
    }

}
