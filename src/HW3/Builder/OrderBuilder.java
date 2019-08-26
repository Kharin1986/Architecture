package HW3.Builder;

public class OrderBuilder {

    private final Order order;

    public OrderBuilder(String magicNumber) {
        this.order = new Order(magicNumber);
    }

    public OrderBuilder type(String type) {
        order.setType(type);
        return this;
    }

    public OrderBuilder price(double price) {
        order.setPrice(price);
        return this;
    }

    public OrderBuilder takeProfit(double takeProfit) {
        order.setTakeProfit(takeProfit);
        return this;
    }

    public OrderBuilder stopLoss(double stopLoss) {
        order.setStopLoss(stopLoss);
        return this;
    }

    public OrderBuilder slippage(int slippage) {
        order.setSlippage(slippage);
        return this;
    }

    public Order build() {
        return order;
    }
}


