package club.banyuan.work.reflection;

public class Student {
    private String name = "张三";
    private int age = 12;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     public void shoe(){
        System.out.println(this.name+this.age);
    }
}
