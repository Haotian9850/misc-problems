package DecoratorPattern;

public class Main {

    public static void main(String[] args){

        /*
        * 适用场景：在不想增加很多子类的情况下扩展一个类的属性
        *
        * */

        Shape normalCircle = new Circle();
        Shape redBorderCircle = new RedShapeDecorator(new Circle());


        System.out.println("Normal circle object...");
        normalCircle.draw();

        System.out.println("Circle with red border...");
        redBorderCircle.draw();

    }

}
