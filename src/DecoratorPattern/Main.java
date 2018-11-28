package DecoratorPattern;

public class Main {

    public static void main(String[] args){

        Shape redCircleShape = new RedShapeDecorator(new Circle());

        redCircleShape.draw();

    }

}
