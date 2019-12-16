package club.banyuan.homework.testTow;

import java.util.Scanner;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入一组单词,以逗号分隔");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        String[] strings=string.split("，");

        TreeSet treeSet=new TreeSet();

        for (int i = 0; i <strings.length ; i++) {
            treeSet.add(strings[i]);
        }

        System.out.println(treeSet);
    }
}
