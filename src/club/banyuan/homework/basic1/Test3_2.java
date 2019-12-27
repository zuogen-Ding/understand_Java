package club.banyuan.homework.basic1;

import java.util.Scanner;

//2.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。

public class Test3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人一个整数");
        int num= sc.nextInt();
//        String c="";
        int c=0;
        int count=0;
        do{
            int b= num%2;
            int a= num/2;
//            c+=b;
            /*System.out.println(c);*/

            double m =Math.pow(10,count);
            c+=(b*m);

            num =a;
            count++;
        }while(num!=0);
        /*StringBuilder result = new StringBuilder(c);
        result.reverse();
        System.out.println(result);*/
        System.out.println(c);
        }
    }

