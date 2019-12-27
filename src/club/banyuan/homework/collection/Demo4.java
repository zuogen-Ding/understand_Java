package club.banyuan.homework.collection;

//需求：请设计一个方法，可以实现获取任意范围内的随机数。

import java.util.Scanner;

public class Demo4 {
    public long getRandom(int min, int max) {
        int a = (int) (Math.random() * (max - min + 1) + min);
        return a;
    }


    public static void main(String[] args) {
        Demo4 demo4=new Demo4();

        Scanner sc1 =new Scanner(System.in);
        System.out.println("请输入范围最小值");
        int a =sc1.nextInt();
        Scanner sc2 =new Scanner(System.in);
        System.out.println("请输入范围最大值");
        int b =sc2.nextInt();
        System.out.println(demo4.getRandom(a,b));


    }
}
