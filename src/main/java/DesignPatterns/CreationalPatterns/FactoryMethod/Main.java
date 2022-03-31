package DesignPatterns.CreationalPatterns.FactoryMethod;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle= shapeFactory.getShape("Circle");
        circle.draw();

    }
}
