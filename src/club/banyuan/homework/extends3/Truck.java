package club.banyuan.homework.extends3;

public class Truck extends Car{
    private double payload;

    public Truck() {
    }

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}
