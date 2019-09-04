import HW5.strategy.*;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order("наличными");
        Order order2 = new Order("картой");

        SetStrategy setStrategy = new SetStrategy(Burger.CHEESEBURGER, Drinks.COCACOLA,3);
        order1.select(setStrategy);

        SingleStrategy singleStrategy = new SingleStrategy(Burger.BIGMAC,2,Drinks.COCACOLA,1);
        order2.select(singleStrategy);
    }
}



