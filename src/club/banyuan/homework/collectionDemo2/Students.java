package club.banyuan.homework.collectionDemo2;



import java.util.TreeSet;

public class Students implements Comparable{

    private String name=null;
    private int num=0;
    private int grade=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {

        //将Object类型强转成Students类型
        Students students=(Students)o;

        //比较分数
        int num1=students.grade-this.grade;

        //如果分数一样，比较学号大小
        int num2= num1==0 ? students.num-this.num:num1;

        return num2;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {

        TreeSet<Students> treeSet=new TreeSet<Students>();
        Students[]  students=new Students[40];


        for (int i = 0; i <40 ; i++) {
            students[i]=new Students();
            students[i].setName("同学"+(10+i));
            students[i].setNum(180200+i+1);
            students[i].setGrade((int) (Math.random() * (100 - 50 + 1) + 50));

            treeSet.add(students[i]);


        }

        System.out.println(treeSet);

    }


}
