package DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        this.decoratedShape.draw();
        setColor(this.decoratedShape);
    }

    private void setColor(Shape decoratedShape){
        System.out.println("Color: red!");
    }
}
