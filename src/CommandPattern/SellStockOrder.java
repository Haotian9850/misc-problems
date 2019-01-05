package CommandPattern;

public class SellStockOrder implements Order {
    private Stock stock;
    private int quantity;

    public SellStockOrder(Stock stock, int quantity){
        this.quantity = quantity;
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell(this.quantity);
    }
}
