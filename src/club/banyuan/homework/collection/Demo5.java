package club.banyuan.homework.collection;

public class Demo5 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 26; i++) {
            char a=(char)('z'-i);
            stringBuffer.append(a);

        }
        System.out.println(stringBuffer);

        stringBuffer.delete(0,4);
    }


}
