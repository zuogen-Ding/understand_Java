package club.banyuan.homework;

public class Worker {
    private String name;
    private String num;
    private int wage;

    public Worker() {
    }

    public Worker(String name, String num, int wage) {
        this.name = name;
        this.num = num;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }


}
