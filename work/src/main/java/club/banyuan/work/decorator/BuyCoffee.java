package club.banyuan.work.decorator;

import club.banyuan.work.decorator.MyDecorator.Milk;
import club.banyuan.work.decorator.MyDecorator.Sugar;
import club.banyuan.work.decorator.myCoffee.RedCoffee;

public class BuyCoffee {
    public static void main(String[] args) {
        Drink drink = new RedCoffee();
        System.out.println(drink.cost());
        System.out.println(drink.getName());
        drink=new Sugar(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getName());
        drink=new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getName());
    }
}
