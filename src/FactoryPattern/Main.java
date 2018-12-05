package FactoryPattern;

public class Main {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circleShape = ShapeFactory.getShape("circle");
        circleShape.draw();
    }
}
