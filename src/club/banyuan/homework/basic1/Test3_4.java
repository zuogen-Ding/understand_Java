package club.banyuan.homework.basic1;

//找出能被5或6整除，但不能被两者同时整除的数

import java.util.Scanner;

public class Test3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人一个数");
        int  num=sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                if (i % 5 == 0 || i % 6 == 0) {
                    System.out.println(i + "");
                }
            }

        }
    }

}
