package HW5.strategy;

public class Order {

    private String payMethod;

    public Order(String payMethod) {
        this.payMethod = payMethod;
    }

    public void select (SelectionStrategy selectionStrategy) {
        selectionStrategy.select(payMethod);
    }
}