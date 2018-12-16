package ObserverPattern;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject sub){
        this.subject = sub;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string: " + Integer.toBinaryString(this.subject.getState()));
    }
}
