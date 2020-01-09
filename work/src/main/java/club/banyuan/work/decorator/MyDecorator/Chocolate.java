package club.banyuan.work.decorator.MyDecorator;

import club.banyuan.work.decorator.Drink;
import club.banyuan.work.decorator.DrinkBar;

public class Chocolate extends DrinkBar {

    public Chocolate(Drink drink) {
        super(drink);
        super.setName("Chocolate");
        super.setPrice(20);

    }
}
