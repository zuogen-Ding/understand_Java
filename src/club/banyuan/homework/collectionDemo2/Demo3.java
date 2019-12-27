package club.banyuan.homework.collectionDemo2;

//3.在一个列表中存储以下元素：apple,grape,banana,pear
//  返回集合中的最大的和最小的元素
//  将集合进行排序，并将排序后的结果打印在控制台上

import java.util.TreeSet;

public class Demo3 {

    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add("apple");
        treeSet.add("grape");
        treeSet.add("banana");
        treeSet.add("pear");
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet);
    }
}
