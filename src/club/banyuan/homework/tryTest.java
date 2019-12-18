package club.banyuan.homework;

public class tryTest {
    public static void main(String[] args) {
        tryTest tryTest=new tryTest();
        System.out.println(tryTest.tryc());
    }

    public int tryc(){
        int a=0;
        try{
            int c=5/0;
            a++;
            System.out.println("try"+a);
        }catch (Exception e){
            a++;
            System.out.println("catch"+a);
            return a;
        }finally {
            a++;

            System.out.println("finally"+a);
//            return  a;
            return a;
        }
//        return a;

    }
}
