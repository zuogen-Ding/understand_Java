package club.banyuan.homework.basic3;


/*1.你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
        输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
        输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。*/

import java.util.Scanner;

public class Test5_1 {

    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < i + 1; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数");
            int a = sc.nextInt();
            if(a==-1){
                break;
            }else if(a<=0&&a>=100000){
                System.out.println("请输入0到100000的数，不包含0和100000");

            }else if(a%2==0){
                countEven++;
            }else if(a%2!=0){
                countOdd++;
            }
        }
        System.out.println("偶数有"+countEven+"个,奇数有"+countOdd+"个");
    }
}
