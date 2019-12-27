package club.banyuan.homework.basic3;


/*
2:数据加密问题
        某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
        在传递过程中需要加密，加密规则如下：
        首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3
        最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
        然后，把加密后的结果在控制台打印出来
*/

import java.util.Arrays;
import java.util.Scanner;

public class Test5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人一个小于8位的整数(默认8位）");
        int num= sc.nextInt();
        int num1=0;
        int count=0;
        int[] arr=new int[count];
        if (num < 10) {
            int a=(num+5)%10;
            System.out.println(a);
        } else {
            while (num>0) {
                int a = num % 10;
                num = num / 10;
                num1=num1*10+a;
            }

        }

        while (num1>0) {
            int a = num1 % 10;
            num1 = num1 / 10;
            count++;
            arr[count-1]=a;
        }

        for (int i = 0; i <count ; i++) {
            arr[i]=(arr[i]+5)%10;

        }

        int temp =arr[0];
        arr[0]=arr[count-1];
        arr[count-1]=temp;

        System.out.println(Arrays.toString(arr));

    }
}
