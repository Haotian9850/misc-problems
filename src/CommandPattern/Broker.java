package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    //命令调用类

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        this.orderList.add(order);
    }

    public void placeOrder(){
        for(Order od : this.orderList){
            od.execute();
        }
        //after all orders are promptly executed
        this.orderList.clear();
    }
}
