package AdaptorPattern;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }
}
