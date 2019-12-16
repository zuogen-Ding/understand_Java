package club.banyuan.homework.extends3;

public class Test {
    public static void main(String[] args) {
        Car car= new Car(4,3.5,5);
        Truck truck= new Truck(6,19.9,2,112.5);
        car.getLoader();
        Vehicle vehicle=new Vehicle(4,3.5);

        truck.getPayload();

    }
}
