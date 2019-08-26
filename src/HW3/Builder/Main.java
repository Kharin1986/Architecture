package HW3.Builder;

public class Main {
    public static void main(String[] args) {

        OrderBuilder firstBuilder = new OrderBuilder(Long.toString(System.currentTimeMillis()));
        Order firstOrder = firstBuilder
                .price(1350.0)
                .type("BUY")
                .stopLoss(1100.0)
                .takeProfit(1900.0)
                .slippage(30)
                .build();
        System.out.println(firstOrder);
    }
}

