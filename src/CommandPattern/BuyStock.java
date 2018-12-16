package CommandPattern;

public class BuyStock implements Order {
    private Stock stock;
    private int quantity;

    public BuyStock(Stock stock, int quantity){
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        this.stock.buy(this.quantity);
    }
}
