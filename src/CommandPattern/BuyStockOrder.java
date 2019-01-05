package CommandPattern;

public class BuyStockOrder implements Order {
    private Stock stock;
    private int quantity;

    public BuyStockOrder(Stock stock, int quantity){
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        this.stock.buy(this.quantity);
    }
}
