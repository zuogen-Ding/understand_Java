package club.banyuan.homework.collectionDemo2;


//手动输入一行字符串，去掉其中重复字符，打印出不同的那些字符

import java.util.HashSet;
import java.util.Scanner;

public class Demo5 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一组字符串");
        String s=sc.next();
        int count=0;
        HashSet hashSet=new HashSet();
        while (count<s.length()){
            char a=s.charAt(count);
            hashSet.add(a);
            count++;
        }

        System.out.println(hashSet);
    }
}
