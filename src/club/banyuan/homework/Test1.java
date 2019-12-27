package club.banyuan.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int num1 = sc.nextInt();
        int[] arr = new int[4];
        int count = 0;
        if (num1 == 0000) {
            System.out.println("0000");
        } else {
            while (count<4) {
                int a = num1 % 10;
                num1 = num1 / 10;
                arr[3-count] = a;
                count++;
            }
        }
        for (int i = 0; i < 4; i++) {
            arr[i] = (arr[i] + 9) % 10;
        }

        int temp1 = arr[0];
        arr[0]=arr[2];
        arr[2]=temp1;

        temp1 = arr[1];
        arr[1]=arr[3];
        arr[3]=temp1;

        System.out.println(arr[0]+""+arr[1]+""+arr[2]+""+arr[3]);
    }
}
