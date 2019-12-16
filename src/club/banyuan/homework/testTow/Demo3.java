package club.banyuan.homework.testTow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<HashMap<String, String>>();
        HashMap hashMap1=new HashMap();
        hashMap1.put("周瑜","小乔");
        hashMap1.put("吕布","貂蝉");

        HashMap hashMap2=new HashMap();
        hashMap2.put("郭靖","黄蓉");
        hashMap2.put("杨过","小龙女");

        HashMap hashMap3=new HashMap();
        hashMap3.put("令狐冲","任盈盈");
        hashMap3.put("林平之","岳灵珊");

        arrayList.add(hashMap1);
        arrayList.add(hashMap2);
        arrayList.add(hashMap3);

        for (HashMap hashMap:arrayList) {
            Set set=hashMap.keySet();
            for (Object o:set) {
                String s=String.valueOf(o);
                System.out.println(s+"---"+hashMap.get(s));
            }
        }
    }
}
