package AdaptorPattern;

public class Main {

    /*
    * Adpator pattern: class (Client) expecting some type of object and we have an object
    * (Adaptee) offering the same features but exposing a different interface
    *
    * Steps to use an adpater:
    *   1. the client makes a request to the adapter by calling a method on its using the
    *   target interface
    *   2. The adapter translates that request on the adaptee using the adaptee interface
    *   3. Client receive the results of the call and is unaware of the adapter's presence
    * */

    public static void main(String[] args){
        //In this case, ToyDuck is the client and Bird is adaptee (thru BirdAdapter Class)
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        //in case ToyDuck is in shortage, need to use Bird object. But they implement different
        //interfaces, now what to do? Use the BirdAdepter!
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        sparrow.fly();
        sparrow.makeSound();

        toyDuck.squeak();

        birdAdapter.squeak();
    }
}
