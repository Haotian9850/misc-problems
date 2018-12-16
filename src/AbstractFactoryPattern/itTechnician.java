package AbstractFactoryPattern;

public class itTechnician {

    private AbstractFactory af;
    private CPU cpu= null;
    private MotherBoard motherBoard = null;

    public itTechnician(AbstractFactory af){
        this.af = af;
    }

    public void makeComputer(){
        prepareHardware();
    }

    private void prepareHardware(){
        this.cpu = this.af.makeCPU();
        this.motherBoard = this.af.makeMotherBoard();

        this.cpu.calculate();
        this.motherBoard.installCPU(this.cpu);

    }

}
