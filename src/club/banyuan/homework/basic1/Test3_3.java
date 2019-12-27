package club.banyuan.homework.basic1;

//输入一批整数，使用循环求出最大值与最小值，输入0时结束。

import java.util.Scanner;


//3.输入一批整数，使用循环求出最大值与最小值，输入0时结束。


public class Test3_3 {
    public static void main(String[] args) {

        int small = 0;  //最小值
        int big = 0;    //最大值
        for (int i = 0; i < i + 1; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            } else if (i == 0) {
                small = a;
            } else if (a < small) {
                small = a;
            } else if (a > big) {
                big = a;
            }
        }


        System.out.println("最小" + small + "最大" + big);
    }

}
