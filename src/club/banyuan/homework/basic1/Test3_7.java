package club.banyuan.homework.basic1;

import java.util.Scanner;

public class Test3_7 {
    //一个输入正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输人一个正整数");
        int num = sc.nextInt();
        int num1 =0;

        if (num < 10) {
            System.out.println(num);
        } else {
            while (num>0) {

                int a = num % 10;
                num = num / 10;
                num1=num1*10+a;

            }
            System.out.println(num1);
        }


    }
}
