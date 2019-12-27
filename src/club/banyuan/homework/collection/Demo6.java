package club.banyuan.homework.collection;

public class Demo6 {

    public static String show(String string ,int start,int end){
        String  a= string.substring(start,end);
        char[] b= a.toCharArray();
        char[] d =new char[end-start];
        String st2 = null;
        for (int i = 0; i < b.length; i++) {

            st2=string.replace(b[b.length-i-1],d[i]);
        }

        return st2;
    }

    public static void main(String[] args) {
        String string="我是你爸爸";
        System.out.println(Demo6.show(string,1,4));
    }
}
