package HW5.strategy;

public class SetStrategy implements SelectionStrategy{

    private final Burger burger;
    private final Drinks drinks;
    private final int quantity;

    public SetStrategy(Burger burger, Drinks drinks,int quantity) {
        this.burger = burger;
        this.drinks = drinks;
        this.quantity = quantity;
    }

    @Override
    public void select( String payMethod) {
        System.out.println("Ваш заказ: Комбо "+quantity+" шт.");
        System.out.println(burger.toString());
        System.out.println(drinks.toString());
        System.out.println("CHIPS");
        System.out.println("Оплата "+payMethod);
    }
}
