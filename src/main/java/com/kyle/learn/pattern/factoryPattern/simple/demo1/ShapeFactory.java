package com.kyle.learn.pattern.factoryPattern.simple.demo1;

/**
 * Created with IntelliJ IDEA.
 * User:
 * Date: 2017-01-10:18:13
 */
public class ShapeFactory {

    public static Shape getShape(String type) {
        Shape shape = null;
        switch (type) {
            case "round":
                shape = new RoundShape();
                break;
            case "square":
                shape = new SquareShape();
                break;
            case "triangle":
                shape = new TriangleShape();
                break;
            default:
                break;
        }

        return shape;
    }
}
