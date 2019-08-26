package HW3.Builder;

public class Order {
    private String magicNumber;
    private String type;
    private double price;
    private double takeProfit;
    private double stopLoss;
    private int slippage;

    public Order(String magicNumber) {
        this.magicNumber = magicNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTakeProfit(double takeProfit) {
        this.takeProfit = takeProfit;
    }

    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    public void setSlippage(int slippage) {
        this.slippage = slippage;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getTakeProfit() {
        return takeProfit;
    }

    public double getStopLoss() {
        return stopLoss;
    }

    public int getSlippage() {
        return slippage;
    }

    @Override
    public String toString() {
        return "HW3.Builder{" +
                "magicNumber='" + magicNumber + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", takeProfit=" + takeProfit +
                ", stopLoss=" + stopLoss +
                ", slippage=" + slippage +
                '}';
    }
}
