package ObserverPattern;

import AbstractFactoryPattern.IntelMotherBoard;

public class HexObserver extends Observer {

    public HexObserver(Subject sub){
        this.subject = sub;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex string: " +
                Integer.toHexString(this.subject.getState()).toUpperCase());
    }
}
