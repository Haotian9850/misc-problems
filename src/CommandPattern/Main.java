package CommandPattern;

public class Main {

    /*
    * Make command an object
    * */

    public static void main(String[] args){
        Stock testStock = new Stock("ABCD", 29);

        //initiate orders
        Order buyStockOrder = new BuyStock(testStock, 9);
        Order sellStockOrder = new SellStock(testStock, 12);

        //init broker (order processor)
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();

        Order buyStockOrder2 = new BuyStock(testStock, 1);
        Order sellStockOrder2 = new SellStock(testStock, 100);

        broker.takeOrder(buyStockOrder2);
        broker.takeOrder(sellStockOrder2);

        broker.placeOrder();
    }

}
