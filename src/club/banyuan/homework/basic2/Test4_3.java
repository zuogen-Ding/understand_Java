package club.banyuan.homework.basic2;

import java.util.Scanner;

/*打印出下面的图案
        54321
        5432
        543
        54
        5*/

public class Test4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人一个整数");
        int num= sc.nextInt();
        int[][] a=new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i ; j++) {
                a[i][j]=num-j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
