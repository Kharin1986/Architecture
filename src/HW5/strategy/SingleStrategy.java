package HW5.strategy;

public class SingleStrategy implements SelectionStrategy {

    private final Burger burger;
    private final int quantityBurgers;
    private final Drinks drinks;
    private final int quantityDrinks;

    public SingleStrategy(Burger burger, int quantityBurgers, Drinks drinks, int quantityDrinks) {
        this.burger = burger;
        this.quantityBurgers = quantityBurgers;
        this.drinks = drinks;
        this.quantityDrinks = quantityDrinks;
    }

    @Override
    public void select(String payMethod) {
        System.out.println("Ваш заказ:");
        System.out.println(burger.toString()+" "+quantityBurgers+" шт.");
        System.out.println(drinks.toString()+" "+quantityDrinks+" шт.");
        System.out.println("Оплата "+payMethod);
    }
}
