package AbstractFactoryPattern;

public class amdCPU extends CPU {

    public amdCPU(int pinNumber){
        this.pinNumber = pinNumber;
    }

    @Override
    void calculate() {
        System.out.println(this.pinNumber);
    }
}
