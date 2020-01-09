package club.banyuan.work.decorator.myCoffee;

import club.banyuan.work.decorator.Drink;

public class Coffee extends Drink {
    @Override
    public int cost() {
        return super.getPrice();
    }
}
