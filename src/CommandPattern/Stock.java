package CommandPattern;

public class Stock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(int quantity){
        this.quantity += quantity;
        if(this.quantity <= 0){
            throw new RuntimeException("No more stocks!");
        }
        System.out.println("Buying stock " + this.name + " " + this.quantity);
    }

    public void sell(int quantity){
        this.quantity -= quantity;
        if(this.quantity < 0){
            throw new RuntimeException("No more stocks!");
        }
        System.out.println("Selling stock " + this.name + " " + this.quantity);
    }

}
