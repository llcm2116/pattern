package com.kyle.learn.pattern.factoryPattern.simple.dmeo3;


/**
 * Created with IntelliJ IDEA.
 * User: Kyle
 * Date: 2017-03-17:14:33
 */
public abstract class Shape {

    public abstract void draw();

    public abstract void erase();

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
