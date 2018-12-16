package ObserverPattern;

public class Main {

    /*
    * Scenario: one-to-many relationship
    * */

    public static void main(String[] args){
        Subject subject = new Subject();

        new BinaryObserver(subject);    //创建耦合关系
        new HexObserver(subject);   //创建耦合关系

        System.out.println("First state...");
        subject.setState(8);

        System.out.println("Second state...");
        subject.setState(29);

        System.out.println("Third state....");
        subject.setState(76);
    }
}
