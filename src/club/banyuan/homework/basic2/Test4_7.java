package club.banyuan.homework.basic2;

import java.util.Scanner;

//声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分
public class Test4_7 {
    public static void main(String[] args) {
        int[] arr= new int[8];

        for (int i = 0; i <arr.length ; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输人一个整数");
            int num= sc.nextInt();
            arr[i] =num;
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            int c=arr[i];
            sum+= c;
        }

        System.out.println("总分"+sum+"平均分"+(sum/8)+"最大分数"+arr[7]+"最小分数"+arr[0]);
    }

}
