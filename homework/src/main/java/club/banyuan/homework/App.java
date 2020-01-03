package club.banyuan.homework;

/**
 * Hello world!
 *
 */
class Parent {
    public void count() {
        System.out.println(10%3);
    }
}
class Child  extends Parent{
    public void count() {
        System.out.println(10/3);
    }
    public static void main(String args[]) {
        Parent p = new Child();
        p.count();
    }
}

