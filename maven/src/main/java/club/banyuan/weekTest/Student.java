package club.banyuan.weekTest;

public class Student {

    private  int num;
    private  String name;
    private  int age;
    private  int python;
    private  int java;
    private  int linux;
    private  int sql;
    private  int sum;
    private  int avg;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

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

    public int getPython() {
        return python;
    }

    public void setPython(int python) {
        this.python = python;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getLinux() {
        return linux;
    }

    public void setLinux(int linux) {
        this.linux = linux;
    }

    public int getSql() {
        return sql;
    }

    public void setSql(int sql) {
        this.sql = sql;
    }

    public int getSum() {
        return python+java+linux+sql;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }


    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", num=" + num +
                ", age=" + age +
                ", python=" + python +
                ", java=" + java +
                ", linux=" + linux +
                ", sql=" + sql +
                ", sum=" + sum +
                ", avg=" + avg
                ;
    }
}
