package AbstractFactoryPattern;

public class IntelCPU extends CPU {

    public IntelCPU(int pinNumber){
        this.pinNumber = pinNumber;
    }

    @Override
    void calculate() {
        System.out.println(this.pinNumber);
    }
}
