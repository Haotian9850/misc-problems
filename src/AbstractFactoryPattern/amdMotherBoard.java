package AbstractFactoryPattern;

public class amdMotherBoard extends MotherBoard {

    public amdMotherBoard(int pinNumber){
        this.pinNumber = pinNumber;
    }

    public void installCPU(CPU cpu){
        if(this.pinNumber != cpu.pinNumber){
            System.out.println("CPU installation failed! Mismatch pin number!");
            return;
        }
        System.out.println("Installation success!");
    }
}
