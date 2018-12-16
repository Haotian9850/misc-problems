package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void attach(Observer obs){
        this.observers.add(obs);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notidyAllObserves();
    }

    public void notidyAllObserves(){
        for(Observer obs : this.observers){
            obs.update();
        }
    }
}
