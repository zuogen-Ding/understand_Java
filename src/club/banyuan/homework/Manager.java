package club.banyuan.homework;

public class Manager extends Worker {

    private double bonus;

    public Manager() {
    }

    public Manager(String name, String num, int wage, double bonus) {
        super(name, num, wage);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
