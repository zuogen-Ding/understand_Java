package club.banyuan.work.decorator.MyDecorator;

import club.banyuan.work.decorator.Drink;
import club.banyuan.work.decorator.DrinkBar;

public class Milk extends DrinkBar {
    public Milk(Drink drink) {
        super(drink);
        super.setName("Milk");
        super.setPrice(5);
    }


}
