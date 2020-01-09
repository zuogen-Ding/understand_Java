package club.banyuan.work.decorator.MyDecorator;

import club.banyuan.work.decorator.Drink;
import club.banyuan.work.decorator.DrinkBar;

public class Sugar extends DrinkBar {

    public Sugar(Drink drink) {
        super(drink);
        super.setName("Sugar");
        super.setPrice(10);
    }
}
