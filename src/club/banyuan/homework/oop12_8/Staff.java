package club.banyuan.homework.oop12_8;

public class Staff extends Employee implements CountWage{

    private double workHours;
    private double basePay;



    public Staff() {
    }

    public Staff(String name, double workHours, double basePay) {
        super(name);
        this.workHours = workHours;
        this.basePay = basePay;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public double countWage() {
        double wage=0;
        if(getWorkHours()<=196){
            wage=basePay;
        }else {
            wage=basePay+(workHours-196)*200;
        }
        super.setWage(wage);
        return wage;
    }



}
