package AbstractFactoryPattern;

public class Main {
    /*
    * 工厂模式的进一步推广，适用于当有多个产品族和类时
    * */

    //client-side code!!!
    public static void main(String[] args){
        AbstractFactory factory = new amdFactory();   //use intel CPU and intel motherboard
        itTechnician installer = new itTechnician(factory);
        installer.makeComputer();
    }
}
