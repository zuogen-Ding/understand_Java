package club.banyuan.homework;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字母");
        char a=sc.next().charAt(0);
        if(a>='A'&&a<='Z'){
            a+=32;
        }else {
            a-=32;
        }
        int variable2=2;
        System.out.println(a);
    }
}
