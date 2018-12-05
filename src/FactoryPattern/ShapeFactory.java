package FactoryPattern;

public class ShapeFactory {

    public static Shape getShape(String shapeType){
        //validate input
        if(shapeType.equals("circle")){
            return new Circle();
        }
        if(shapeType.equals("square")){
            return new Square();
        }

        return null;
    }
}
