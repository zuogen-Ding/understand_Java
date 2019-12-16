package club.banyuan.homework.basic2;

import java.util.Scanner;

public class Test4_1 {

   // 任意输入 n行 n列的乘法口诀表

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人一个十进制整数");
        int num= sc.nextInt();
        for (int i = 1; i < num+1; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println("");
        }

    }
}
