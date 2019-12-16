package club.banyuan.homework.extends2;

public class Worker extends Person {
    private String unit;
    private int workAge;

    public Worker() {
    }

    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public  void  work(){
        System.out.println("盖房子");
    }
}
