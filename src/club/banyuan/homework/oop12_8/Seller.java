package club.banyuan.homework.oop12_8;

public class Seller extends Employee implements CountWage{
    private double sales;
    private double basePay;
    private double wage;


    public Seller() {
    }

    public Seller(String name, double sales, double basePay) {
        super(name);
        this.sales = sales;
        this.basePay = basePay;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double countWage() {
        wage=0;
        if(sales<10000){
            wage =sales*0.1+basePay;
        }else if(sales>=10000&&sales<100000){
            wage =sales*0.15+basePay;
        }else {
            wage =sales*0.18+basePay;
        }
        super.setWage(wage);
        return wage;
    }






}
