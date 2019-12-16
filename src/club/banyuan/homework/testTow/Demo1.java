package club.banyuan.homework.testTow;


import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {

        String string="123,456,789,123,456";
        char[] chars= string.toCharArray();

        HashMap hashMap=new HashMap();
        for (int i = 0; i <chars.length ; i++) {
            hashMap.put(chars[i],0);
        }

        for (int i = 0; i < chars.length; i++) {
            if(hashMap.containsKey(chars[i])){
                int a=Integer.parseInt(hashMap.get(chars[i]).toString());
                a++;
                hashMap.replace(chars[i],a);
            }
        }

        System.out.println(hashMap);
    }
}
