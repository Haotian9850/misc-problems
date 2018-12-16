package CommandPattern;

public class SellStock implements Order {
    private Stock stock;
    private int quantity;

    public SellStock(Stock stock, int quantity){
        this.quantity = quantity;
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell(this.quantity);
    }
}
