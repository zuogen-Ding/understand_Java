package club.banyuan.homework.collectionDemo2;

//产生10个1~20之间的随机数，要求随机数不能重复


import java.util.HashSet;

public class Demo4 {
    public static void main(String[] args) {
        HashSet hashSet= new HashSet();
        while (hashSet.size()<10){
            int a=(int)( Math.random()*21);
            hashSet.add(a);
        }

        System.out.println(hashSet);
    }
}
