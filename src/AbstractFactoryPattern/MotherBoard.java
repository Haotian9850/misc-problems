package AbstractFactoryPattern;

public abstract class MotherBoard {

    int pinNumber;
    abstract void installCPU(CPU cpu);

}
