package club.banyuan.homework;

public class Demo {
    public static void main(String[] args) {
        System.out.println(show());
    }


    public static int show() {
        int a = 4;
        int b=2;
        try {
            System.out.println(a/0);
            b=4;
        }catch (Exception e){
            b=9;
            return b;
        }finally {
            b=10;
        return b;
        }
    }
}