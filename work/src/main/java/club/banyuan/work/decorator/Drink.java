package club.banyuan.work.decorator;

public abstract class Drink {

    public String name;
    public int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //价格
    public abstract int cost();
}
