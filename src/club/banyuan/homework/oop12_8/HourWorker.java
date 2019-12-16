package club.banyuan.homework.oop12_8;

public class HourWorker extends Employee implements CountWage{

    private double hour ;
    private double hourPay;




    public HourWorker() {
    }




    public HourWorker(double hour, double hourPay) {
        this.hour = hour;
        this.hourPay = hourPay;
    }

    public HourWorker(String name, double hour, double hourPay) {
        super(name);
        this.hour = hour;
        this.hourPay = hourPay;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHourPay() {
        return hourPay;
    }

    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }




    @Override
    public double countWage() {
        double wage;
         wage=hour*hourPay;
         super.setWage(wage);
         return wage;
    }

}
