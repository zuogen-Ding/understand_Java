package club.banyuan.homework.string;

import sun.jvm.hotspot.runtime.Bytes;
import sun.nio.cs.UTF_32;
import sun.nio.cs.ext.GBK;

import java.util.Arrays;


public class StringTest {
    public static void main(String[] args) {


//      1.将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
//      将上诉字节数组  从指定的位置开始到结束转换成字符串输出
        byte [] by={65,67,68,97,98,101};
        String string=new String(by);
        System.out.println(string);



//        2. 同样的自定义一个字符数组用字符串的方式输出
        char[] cha ={'a','b'};
        System.out.println(String.valueOf(cha));

//        3. "abcdw" "ABCDw" 比较两个字符串是否相等 忽略大小写
        String abc="abcdw";
         abc.equalsIgnoreCase("ABCDw");

//        4. "我是你的谁,我是你的剑" 判断是否包含 "剑"
          String a="我是你的谁,我是你的剑";
        System.out.println(a.contains("剑"));

//        5. 第四题字符串判断是否以 "我开头", 判断是否以 "剑" 结尾
        System.out.println(a.startsWith("我")+" "+a.endsWith("剑"));
//        6. String str = "" 和 String str2 = null;
//        判断他们是否为空
        String str = "";
        String str2 = null;

//        7. 找到此字符串 "我是你的小宝贝" 的 "我" 进行输出
        String wo="我是你的小宝贝";
        System.out.println(wo.charAt(wo.indexOf("我")));
//        8. 找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
        String ni="我是你的谁,我是你的剑";
        System.out.println(wo.indexOf("你"));
//        9. 找到上面 8 题的 最后一次出现 "你" 的位置, 然后再从 第4个位置开始找 第一次出现的 "你"
        System.out.println(ni.lastIndexOf("你"));
        System.out.println(ni.indexOf("你",3));
//        10. "我是你的谁,我是你的剑" 从指定位置开始截取长度;
        String jian="我是你的谁,我是你的剑";
        System.out.println(jian.substring(3));
//        从指定位置开始截取到指定位置结束长度的字符串
        System.out.println(jian.substring(1,4));
        String j=" 我是你的谁,我是你的剑 ";
        System.out.println(j.trim());
//        12. "我是你的谁,我是你的剑" 替代字符串里面的 "谁", 改为 "被子"
        System.out.println(jian.replace("谁","被子"));
//        13. "我是你的谁,我是你的剑" 替换该字符串的所有的 "你" 改为 "哈"
        System.out.println(jian.replaceAll("你","哈"));
//        14. 比较 "avabc" 和 "avab" 字符串
        String ab="avabc";
        System.out.println(ab.equals("avab"));
//        15. 将字符数组转换成 字符串输出
        char[] ch ={'a','b'};
        System.out.println(String.valueOf(cha));
//        16. 将字节数组以指定的编码格式转换成字符串，再转换后的字符串以指定的编码格式转换成字节数组
        byte[] s=string.getBytes();
        System.out.println(new String(s));



    }
}
