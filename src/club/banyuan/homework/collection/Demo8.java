package club.banyuan.homework.collection;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo8 {

    public static String getStr(String string ,int num) throws UnsupportedEncodingException {
        byte[] bytes=string.getBytes("GBK");
        int j=0;
        System.out.println(Arrays.toString(bytes));

        String str=null;
        if (num==1) {
            if (bytes[num - 1] < 0) {
                return null;
            } else {
                j = 1;
            }
        }else {
            if (bytes[num - 2] > 0 && bytes[num - 1] < 0) {
                j = num - 1;

            } else {
                j = num;
            }
        }

        byte[] bytes1=new byte[j];
        for (int i = 0; i <j; i++) {
            bytes1[i] = bytes[i];

        }

        String str2=new String(bytes1,"GBK");
        return  str2;

    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "q我i你u哎";
        System.out.println(Demo8.getStr(s,8));
    }
}
