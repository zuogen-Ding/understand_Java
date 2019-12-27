package club.banyuan.homework.oop12_8;

public class Jewellery extends Employee implements CountWage {

    private int quantity;



    public Jewellery() {
    }

    public Jewellery(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double countWage(){
        double wage;
        wage=quantity*50;
        super.setWage(wage);
        return wage;
    }



}
