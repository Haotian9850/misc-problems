package AbstractFactoryPattern;

public class amdFactory implements AbstractFactory {
    @Override
    public CPU makeCPU() {
        return new amdCPU(938);
    }

    @Override
    public MotherBoard makeMotherBoard() {
        return new amdMotherBoard(938);
    }
}
