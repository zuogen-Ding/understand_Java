package club.banyuan.homework.extends3;

public class Car extends Vehicle{
    private int loader;

     Car() {
    }

     Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
}
