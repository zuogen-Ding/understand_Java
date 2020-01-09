package club.banyuan.work.decorator;

public  class DrinkBar extends Drink {
    private Drink drink;

    public DrinkBar(Drink drink) {
        this.drink = drink;
    }

    @Override
    public int cost() {
        return super.getPrice()+ drink.cost();
    }

    @Override
    public String getName() {
        return super.getName()+" "+super.getPrice()+"加"+drink.getName();
    }
}
