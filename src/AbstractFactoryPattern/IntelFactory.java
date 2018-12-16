package AbstractFactoryPattern;

public class IntelFactory implements AbstractFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU(755);
    }

    @Override
    public MotherBoard makeMotherBoard() {
        return new IntelMotherBoard(755);
    }
}
